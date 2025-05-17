package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        File file = new File("/home/mohammad/IdeaProjects/base/resources/mohammad.txt");
        System.out.println("file one length : "+ file.length());
        System.out.println("file one can read : "+file.canRead());
        System.out.println("file one last modified : "+file.lastModified()); // mili Second last modified from 1970/1/1
        System.out.println("file one is directory : "+file.isDirectory());
        System.out.println("file one is file : "+file.isFile());

        File fileTwo = new File("/home/mohammad/IdeaProjects/base/resources/");
        System.out.println("file two length : "+fileTwo.length());
        System.out.println("file two can read : "+fileTwo.canRead());
        System.out.println("file two last modified : "+fileTwo.lastModified()); // mili Second last modified from 1970/1/1
        System.out.println("file two is directory : "+fileTwo.isDirectory());
        System.out.println("file two isFile : "+fileTwo.isFile());
        String[] files = fileTwo.list();
        for (String s : files) {
            System.out.println("directory content : "+s);
        }

        File fileThree = new File("/home/mohammad/IdeaProjects/base/resources/mohammad.txt");
        //FileReader
        // FileWriter
        try {
            // can read file with scanner
            Scanner scanner = new Scanner(fileThree);
            // we want to create new file with formatter
            Formatter formatter = new Formatter("/home/mohammad/IdeaProjects/base/resources/mohammadTwo.txt");
             while (scanner.hasNextLine()){
                 String line = scanner.nextLine();
                 if (!line.startsWith("good")){
                     formatter.format("%s\n",line);
                 }
             }
             scanner.close();
             // close dar write ahamiat bishtari dare ke agar file neveshte nashode stream dar an , hatman in kar anjam beshe, be alave hamon azad sazi resource
             formatter.close();
        }catch (IOException e){
            e.printStackTrace();
        }


        // try with resources help me to autoClosable if objects that new implement of it
        try(
                Scanner scannerTwo = new Scanner(fileThree);
                Formatter formatterTwo = new Formatter("/home/mohammad/IdeaProjects/base/resources/mohammadThree.txt");
        ){
            while (scannerTwo.hasNextLine()){
                String line = scannerTwo.nextLine();
                if (!line.startsWith("good")){
                    formatterTwo.format("%s\n",line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
