/*
 * the MapReduce functionality implemented in this program takes a single large text file to map i.e. split it into small chunks and then assign 1 to all the found words
 * then reduces by adding count values to each unique words
 */

package io.grpc.filesystem.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Map.Entry;

import io.grpc.filesystem.task2.Mapper;

public class MapReduce {

    public static String makeChunks(String inputFilePath) throws IOException {
        int count = 1; // to generate sequential file names
        int size = 500; // max. byte size for each file
        File f = new File(inputFilePath); // input file
        //read lines from input file f
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String l = br.readLine(); // read line by line

            //chunk creation loop
            while (l != null) { //until all lines have been read
                File newFile = new File(f.getParent() + "/temp", "chunk"
                        + String.format("%03d", count++) + ".txt"); // create new file(s) to save chunks
                //outputstream to write data to created chunk file
                try (OutputStream out = new BufferedOutputStream(new FileOutputStream(newFile))) {
                    int fileSize = 0; // track current file size
                    while (l != null) { // for each line calculate byte size
                        byte[] bytes = (l + System.lineSeparator()).getBytes(Charset.defaultCharset());
                        if (fileSize + bytes.length > size)
                            break; // if exceeds byte size -> full --> new chunk file
                        out.write(bytes);
                        fileSize += bytes.length;
                        l = br.readLine();
                    }
                }
            }
        }
        return f.getParent() + "/temp"; // path to stored chunks

    }

    /**
     * @param inputfilepath
     * @throws IOException
     */
    public static void map(String inputfilepath) throws IOException {
        /*
         * Insert your code here
         * Take a chunk and filter words (you could use "\\p{Punct}" for filtering punctuations and "^[a-zA-Z0-9]"
         * together for filtering the words), then split the sentences to take out words and assign "1" as the initial count.
         * Use the given mapper class to create the unsorted key-value pair.
         * Save the map output in a file named "map-chunk001", for example, in folder
         * path input/temp/map
         */
        File file = new File(inputfilepath); // File containing path to input text (pigs.txt)
        System.out.print(file);
        // Create new directory "map" (one level above (parent) input file)
        File map = new File(file.getParentFile(), "map");
        if (!map.exists()) {
            if (map.mkdirs()) {
                System.out.println("Directory created successfully: " + map.getAbsolutePath());
            } else {
                System.err.println("Failed to create the 'map' directory.");
                
                return;
            }
        }
        // Collect all the files in the map directory in the files array (for correct naming)
        File[] filesInMap = map.listFiles();
        int up = 1;
        if (filesInMap != null) {
            up += filesInMap.length; // Increase 'up' variable for correct naming of new created files
        }
        try {
            // Create output file ("map-chunk0xx.txt")
            File processedChunks = new File(map, "map-chunk" + String.format("%03d", up) + ".txt");
            System.out.print("processedChunks: " + processedChunks.getAbsolutePath());
            // Create the file
            if (processedChunks.createNewFile()) {
                System.out.println("File created successfully: " + processedChunks.getAbsolutePath());
                // Write to file / process data
                FileWriter writer = new FileWriter(processedChunks);
                // Read input files listed in the file "inputpath"
                try (BufferedReader read = new BufferedReader(new FileReader(file))) {
                    String line;
                    // Store key (word) value (1) pairs of all words in the input chunk


                    //HashMap<String, Integer> intermediateMap = new HashMap<>();
                    // Punctuation & split words
                    while ((line = read.readLine()) != null) {
                        String[] tokens = line.replaceAll("\\p{Punct}", "").split("\\s+");
                        // Put key-value pairs into map
                        for (String word : tokens) {
                            word = word.toLowerCase();
                            if (!word.isEmpty()) {
                                writer.write(word + ": 1\n");
                            }
                        }
                    }
                    // Write content of map to output file

                   /* for (Map.Entry<String, Integer> entry : intermediateMap.entrySet()) {
                        writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
                    }*/
                } catch (IOException e) {
                    System.err.println("Error while processing file: " + e.getMessage());
                    e.printStackTrace();
                } finally {
                    writer.close();
                }
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("Error while creating file: " + e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * @param inputfilepath
     * @param outputfilepath
     * @return
     * @throws IOException
     */
    public static void reduce(String inputfilepath, String outputfilepath) throws IOException {
        /*
         * Insert your code here
         * Take all the files in the map folder and reduce them to one file that shows
         * unique words with their counts as "the:64", for example.
         * Save the output of reduce function as output-task2.txt
         */
        File in = new File(inputfilepath + "/map");
        System.out.println("in: ");
        System.out.println(in);
        //create output file "output-task2.txt"
        File out = new File(outputfilepath);
        try {
            if (out.createNewFile()) {
                System.out.println("Datei erstellt: " + out.getAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Error while creating file: " + e.getMessage());
        }
        //to store word frequency pairs
        Map<String, Integer> wordCounts = new HashMap<>();

        //read files "map-chunk0xx.txt"
        File[] files = in.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) { // Check if it's a file
                    System.out.println("Reading file: " + file.getName());
                    // Read and print each line from the file
                    try (BufferedReader read = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = read.readLine()) != null) {
                            // Process the line to extract words and update wordCounts
                            String[] words = line.split(" ");
                            for (String word : words) {
                                if (!word.isEmpty() && !word.equals("1")) {
                                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                                }
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Error while reading file: " + e.getMessage());
                    }
                }

            }
        }

        List<Entry<String, Integer>> list = new ArrayList<>(wordCounts.entrySet());
        list.sort(Entry.comparingByValue());
        // Reverse the list
        Collections.reverse(list);
        list.forEach(System.out::println);
        // Write the word counts to the output file
        try (FileWriter writer = new FileWriter(out)) {
            for (Map.Entry<String, Integer> entry : list) { // Iterate over the sorted list
                if (entry.getKey() != null) {
                    writer.write(entry.getKey() + entry.getValue() + "\n"); // Use "=" as the separator
                }
            }
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + e.getMessage());
        }

    }


    /**
     * Takes a text file as an input and returns counts of each word in a text file
     * "output-task2.txt"
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException { // update the main function if required
        String inputFilePath = args[0];
        String outputFilePath = args[1];
        String chunkpath = makeChunks(inputFilePath); // result of makeChunks = path to directory where chunks are stored

        File dir = new File(chunkpath); // file created


        File[] directoyListing = dir.listFiles(); //list of files in the directory
        if (directoyListing != null) {
            for (File f : directoyListing) { //iterate over files (chunks)
                if (f.isFile()) {
                    map(f.getPath()); //map method called on each chunk (takes current file path)

                }

            }

            reduce(chunkpath, outputFilePath);

        }

    }
}