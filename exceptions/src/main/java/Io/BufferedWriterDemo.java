package Io;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        // Try with resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("story.txt"))) {
            // Write a new line on file.txt
            writer.write("Hello World!");
            // Create a new line on file.txt
            writer.newLine();
            // Write on the new line
            writer.write("This is a simple text file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("story.txt"))) {
            String line;
            // Fetches a line at a time
            while ((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
