package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamWriteFile {
    public static void main(String[] args) {
        // if we this numbers save into text file , we have 30 byte instead 12 byte / every int is 4 byte
        int[] numbers = {1234567890,1234567891,1234567892};
        byte[] array = intToByteArray(numbers);
        FileOutputStream out = null;
        try{
            try {
                out = new FileOutputStream("/home/mohammad/IdeaProjects/base/resources/file");
                out.write(array);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }finally {
            if (out!=null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static byte[] intToByteArray(int[] numbers) {
        byte[] bytes = new byte[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            bytes[i] = (byte) numbers[0];
        }
        return bytes;
    }
}
