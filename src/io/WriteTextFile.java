package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        try {
            // FileWriter is a subclass of Writer , use for write text file , if file exist , remove it , if you
            // want to not remove and if exist append to it , you can call this method with , second method signature append true
            // writer = new FileWriter("/home/mohammad/IdeaProjects/base/resources/writeme.txt",true);
            FileWriter writer = new FileWriter("/home/mohammad/IdeaProjects/base/resources/writeme.txt");
            writer.write("this is a line. \n");
            writer.write("this is second \t line.\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
