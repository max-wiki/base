package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // help to get text , is in java.util , not in java.io
        Scanner scanner = new Scanner(System.in); // System.in is an input stream of user data
        String line = scanner.nextLine();
        int i = scanner.nextInt();
        // scanner class can work with inputStream and reader
        scanner = new Scanner("/home/mohammad/IdeaProjects/base/resources/mohammad.txt");
        try {
            scanner = new Scanner(new File("/home/mohammad/IdeaProjects/base/resources/mohammad.txt"));
            scanner = new Scanner(new FileInputStream("/home/mohammad/IdeaProjects/base/resources/mohammad.txt"));
            scanner = new Scanner(new FileReader("/home/mohammad/IdeaProjects/base/resources/mohammad.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
