package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInputStreamReadFile {
    public static void main(String[] args) {
        List<Byte> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        try {
            // FileInputStream for read a file or read from stream of network
            fileInputStream = new FileInputStream("/home/mohammad/IdeaProjects/base/resources/file.docx");
            int bCode;
            while (-1 != (bCode = fileInputStream.read()))
                list.add((byte) bCode);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        for (Byte b : list) {
            System.out.println(b);
        }
    }
}
