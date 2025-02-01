package Io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {

    }
    public static void readFile()throws FileNotFoundException
    {
        FileReader fileReader=new FileReader("file.txt");
    }
}
