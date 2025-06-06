package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

    public static void main(String[] args) {
        try {
            // FileReader is a subclass of Reader . use for read text file .
            // with create object file open for read .
            FileReader fileReader = new FileReader("/home/mohammad/IdeaProjects/base/resources/mohammad.txt");
            int chCode;
            // usually not use from read() method for read text file char by char
            while (-1 != (chCode=fileReader.read())) // read() method return int because for understand file read is finished return -1
                System.out.println("Next:"+(char) chCode);
            // close file is important for free memory
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
