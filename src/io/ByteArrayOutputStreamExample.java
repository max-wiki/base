package io;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] bytes;
        try {
            // write this Integer in ByteArrayOutputStream
            dataOutputStream.writeInt(34234234);
            // convert to byte array
            bytes = byteArrayOutputStream.toByteArray();
            System.out.println(bytes.length);
            // reset old data
            byteArrayOutputStream.reset();

            dataOutputStream.writeDouble(1);
            bytes = byteArrayOutputStream.toByteArray();
            System.out.println(bytes.length);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
