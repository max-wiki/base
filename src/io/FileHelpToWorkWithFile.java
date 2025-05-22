package io;

import java.io.File;

public class FileHelpToWorkWithFile {
    public static void main(String[] args) {
        // help to work with files , is not for read or write file
        File f = new File("/home/mohammad/IdeaProjects/base/resources/file.docx");
        long length = f.length();
        boolean isdir = f.isDirectory();
        long lastModified = f.lastModified();
        System.out.println("file length : "+length);
        System.out.println("is directory ? "+ isdir);
        System.out.println("last modified : "+lastModified);
    }
}
