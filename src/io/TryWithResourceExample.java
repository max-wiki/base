package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) {
        // before java 7
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("/home/mohammad/IdeaProjects/base/resources/mohammad.txt");
            int read = fileReader.read();
            System.out.println(read);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // after java 7 you can use try with resource to close
        // automatically class that implement autoClosable interface
        try(FileReader fr = new FileReader("/home/mohammad/IdeaProjects/base/resources/mohammad.txt")){
            int read = fr.read();
            System.out.println(read);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
