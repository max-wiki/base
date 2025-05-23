package io;

import java.io.*;

public class BufferedOutputStreamAndPrintStreamExample {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("/home/mohammad/IdeaProjects/base/resources/BufferedOutputStreamExample.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            PrintStream printStream = new PrintStream(bufferedOutputStream);
            printStream.println("hi hi ");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
