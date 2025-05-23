package io;

import java.io.*;

public class SerializableExampleTwo {
    public static void main(String[] args) {
        try {
            // for example we want to create several object and save into file ,
            FileOutputStream fileOutputStream = new FileOutputStream("/home/mohammad/IdeaProjects/base/resources/binaryFile");
            // serialization implemented by this object
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            SerializableExample serializableExample = new SerializableExample("ali", "aliani");
            System.out.println(serializableExample.getUsername());
            System.out.println(serializableExample.getPassword());
            // after run write object , SerializableExample saved into file out put stream
            objectOutputStream.writeObject(serializableExample);
            objectOutputStream.close();
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("/home/mohammad/IdeaProjects/base/resources/binaryFile");
            // object input stream use for deserialization
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SerializableExample serializableExampleTwo = (SerializableExample) objectInputStream.readObject();
            System.out.println(serializableExampleTwo.getUsername());
            System.out.println(serializableExampleTwo.getPassword());
            objectInputStream.close();
            fileInputStream.close();
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
