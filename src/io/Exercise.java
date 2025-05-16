package io;

import java.io.File;

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

    }
}
