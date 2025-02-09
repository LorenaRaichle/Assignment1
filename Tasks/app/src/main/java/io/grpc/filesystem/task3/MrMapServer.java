
/* 
* gRPC server node to accept calls from the clients and serve based on the method that has been requested
*/

package io.grpc.filesystem.task3;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import com.task3.proto.AssignJobGrpc;
import com.task3.proto.MapInput;
import com.task3.proto.ReduceInput;
import com.task3.proto.MapOutput;
import com.task3.proto.ReduceOutput;
import io.grpc.filesystem.task2.*;
import java.util.logging.Level;

public class MrMapServer {
    private static final Logger logger = Logger.getLogger(MrMapServer.class.getName());

    private Server server;

    private void start(int port) throws IOException {
        server = ServerBuilder.forPort(port).addService(new MrMapServerImpl()).build().start();
        System.out.println("Listening on: " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("Terminating the server at port: " + port);
                try {
                    server.shutdown().awaitTermination(10, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    static class MrMapServerImpl extends AssignJobGrpc.AssignJobImplBase {
        MapReduce mr = new MapReduce();

         /* 
         * Insert your code here 
         * Override the map function to accept the request and perform Map
         * Take help of autogenerated file Assignment1/BCS-DS-Assignment-Package/Task3/app/build/generated/source/proto/main/grpc/com/task3/proto/AssignJobGrpc.java
         * Look through the available functions and definition in this Grpc file to complete the task
         */
        @Override
        public StreamObserver<MapInput> map(StreamObserver<MapOutput> responseObserver) {
            return new StreamObserver<MapInput>() {
                @Override
                public void onNext(MapInput mapinput) {
                    mr.map(mapinput.getInputfilepath())
                    responseObserver.onNext(MapOutput.newBuilder().setJobstatus(2).build())
                }

                @Override
                public void onError(Throwable t) {
                  logger.log(Level.WARNING, "routeChat cancelled");
                }

                @Override
                public void onCompleted() {
                  responseObserver.onCompleted();
                }
            }
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final MrMapServer mrServer = new MrMapServer();
        for (String i : args) {

            mrServer.start(Integer.parseInt(i));

        }
        mrServer.server.awaitTermination();
    }

}
