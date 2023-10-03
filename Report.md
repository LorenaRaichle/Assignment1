Assignment 1
------------

# Team Members: Joey Lau, Lorena Raichle

# GitHub link to your (forked) : https://github.com/LorenaRaichle/Assignment1.git

...

# Task 4

1. (0.25pt) What are Interface Definition Languages (IDL) used for? Name and explain the IDL that you use for this task.
   Ans: An Interface Definition Language is used to establish the communication in a remote procedure call (RPC) between client and server. This allows communication across different machines, operating systems and programming languages. An IDL defines the interfaces for 
   the creation of client and server stubs. In the gRPC framework (by Google), the Protocol Buffers IDL (communicate.proto) is used to define messages and the overall structure (for example the rpc methods map & reduce) and is translated into java code after compiling. 
2. (0.25pt) In this implementation of gRPC, you use channels. What are they used for?
   Ans:Channels are needed for the instantiation of the client stubs (blockingstub). To create a channel, we need to specify the parameters host and port to indicate the network address of the server that the stub should connect to.
3. (0.5pt)
   (0.25) Describe how the MapReduce algorithm works. Do you agree that the MapReduce programming model may have latency issues? What could be the cause of this?
   (0.25) Can this programming model be suitable (recommended) for iterative machine learning or data analysis applications? Please explain your argument.
   Ans: The mapReduce algorithm processes data in parallel by dividing it into smaller chunks in the map phase and processing the chunks in parallel.
         In the reduce phase, the intermediate results (key, value pairs) are further processed / reduced by adding up the amount of occurrences and generating the final output. 
         Due to the parallel distribution of tasks to several workers, the storage of intermediate results and the management of available resources, latency issues are expected. However, the there are advantages in terms of scalability to process a large amount of data. 
         This programming model is not suitable for iterative ML applications since the same results are reused in an iterative approach. Invoking the MapReduce algorithm several times and re-reading and re-writing from or to files would lead to latency issues.
         For iterative approaches, in-memory approaches are more efficient.

