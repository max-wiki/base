package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        // is not reader/writer , is not inputStream/outputStream
        // rw is mode read and write access to file , can user file binary or text ,
        // for read and write , object has a number as a file pointer
        // can change file pointer with seek(long) method , has several method for read and write
        RandomAccessFile randomAccessFile =
                null;
        try {
            randomAccessFile = new RandomAccessFile("/home/mohammad/IdeaProjects/base/resources/randomAccessFile.txt",
                    "rw");
        // read a single byte
        byte ch = randomAccessFile.readByte();
        // read a 32-bit integer (binary read)
        int i = randomAccessFile.readInt();
        // read text
        String line = randomAccessFile.readLine();
        // 5 bytes from the beginning of the file
        randomAccessFile.seek(5);
        // write text
        randomAccessFile.writeBytes("this will complete the demo");
        // write 8-bytes (binary)
        randomAccessFile.writeDouble(1.2);
        randomAccessFile.close();
        } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
