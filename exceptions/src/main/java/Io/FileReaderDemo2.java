package Io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            // Connects to a new FileReader
            fileReader = new FileReader("story.txt");
            // -1 means end of file in a FileReader
            int character=0;
            while((character=fileReader.read())!=-1)
            {
                System.out.print((char) character);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }finally {
            if(fileReader!=null)
            {
                fileReader.close();
            }
        }
    }
}
