/* 
* Client program to request for map and reduce functions from the Server
*/

package io.grpc.filesystem.task3;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.task3.proto.AssignJobGrpc;
import com.task3.proto.MapInput;
import com.task3.proto.ReduceInput;
import com.task3.proto.MapOutput;
import com.task3.proto.ReduceOutput;
import io.grpc.filesystem.task2.*;
import io.grpc.Status;
import java.lang.RuntimeException

import java.io.*;
import java.nio.charset.Charset;

public class MrClient {
   private static final Logger logger = Logger.getLogger(MrClient.class.getName());
   Map<String, Integer> jobStatus = new HashMap<String, Integer>();

   public  void requestMap(String ip, Integer portnumber, String inputfilepath, String outputfilepath) throws InterruptedException {
      
      /* 
      * Insert your code here 
      * Create a stub for calling map function from the server
      * Remember that the map function uses client stream
      * Update the job status every time the map function finishes mapping a chunk, it is useful for calling reduce function once all of the chunks are processed by the map function
      */
      
      // Create a channel to connect to the server
      ManagedChannel channel = ManagedChannelBuilder.forAddress(ip, portnumber)
      .usePlaintext() 
      .build();

      // Create a gRPC stub for the MapService
      AssignJobGrpc.AssignJobStub mapServiceStub = AssignJobGrpc.newStub(channel);

      final CountDownLatch finishLatch = new CountDownLatch(1);

      StreamObserver<MapOutput> requestObserver = mapServiceStub.map(new StreamObserver<MapOutput>() {
         @Override
         public void onNext(MapOutput op) {
            // Handle responses from the server as they arrive
            System.out.println("Received response: " + op);
            jobStatus.put(inputfilepath, 2);
         }
     
         @Override
         public void onError(Throwable t) {
            Status status = Status.fromThrowable(t);
            logger.log(Level.WARNING, "RouteChat Failed: {0}", status);
            finishLatch.countDown();
         }
     
         @Override
         public void onCompleted() {
            // Called when the server has finished processing the stream
            System.out.println("Server has completed processing.");
            finishLatch.countDown();
             
         }
     });

     try {
      for (String key : jobStatus.entrySet()){
       requestObserver.onNext(key.getKey())
      }
     } catch (RuntimeException e){
      requestObserver.onError(e);
      throw e;
     }

      // Notify the server that the client has finished sending requests
      requestObserver.onCompleted();

      finishLatch.await(1, TimeUnit.MINUTES);

   }

   public int requestReduce(String ip, Integer portnumber, String inputfilepath, String outputfilepath) {
       
      /* 
      * Insert your code here 
      * Create a stub for calling reduce function from the server
      * Remember that the map function uses unary call
      */


      ManagedChannel channel = ManagedChannelBuilder.forAddress(ip, portnumber)
      .usePlaintext() 
      .build();

      AssignJobGrpc.AssignJobBlockingStub reduceServiceStub = AssignJobGrpc.newBlockingStub(channel);

      ReduceInput request = ReduceInput.newBuilder().setIp(ip).setPort(portnumber)
      .setInputfilepath(inputfilepath)
      .setOnputfilepath(outputfilepath)
      .build()

      try {
         ReduceOutput op = reduceServiceStub.reduce(request)
         return op.getJobstatus()
      } catch (StatusRuntimeException e) {
         logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
         return 0;
      }

   }
   public static void main(String[] args) throws Exception {// update main function if required

      String ip = args[0];
      Integer mapport = Integer.parseInt(args[1]);
      Integer reduceport = Integer.parseInt(args[2]);
      String inputfilepath = args[3];
      String outputfilepath = args[4];
      String jobtype = null;
      MrClient client = new MrClient();
      int response = 0;

      MapReduce mr = new MapReduce();
      String chunkpath = mr.makeChunks(inputfilepath);
      Integer noofjobs = 0;
      File dir = new File(chunkpath);
      File[] directoyListing = dir.listFiles();
      if (directoyListing != null) {
         for (File f : directoyListing) {
            if (f.isFile()) {
               noofjobs += 1;
               client.jobStatus.put(f.getPath(), 1);

            }

         }
      }
      client.requestMap(ip, mapport, inputfilepath, outputfilepath);

      Set<Integer> values = new HashSet<Integer>(client.jobStatus.values());
      if (values.size() == 1 && client.jobStatus.containsValue(2)) {

         response = client.requestReduce(ip, reduceport, chunkpath + "/map", outputfilepath);
         if (response == 2) {

            System.out.println("Reduce task completed!");

         } else {
            System.out.println("Try again! " + response);
         }

      }

   }

}
