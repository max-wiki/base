package io;

import java.io.File;

public class FileHelpToWorkWithFile {
    public static void main(String[] args) {
        // help to work with files , is not for read or write file
        // character / is for separate folder in windows should use \
        // in windows is important if use \t or \n in file path , \ character is escape character in java and tab or new line if used
        // for solve this problem use / or use \\ to solve this problem.
        File f = new File("/home/mohammad/IdeaProjects/base/resources/file.docx");
        long length = f.length();
        boolean isdir = f.isDirectory();
        long lastModified = f.lastModified();
        System.out.println("file length : "+length);
        System.out.println("is directory ? "+ isdir);
        System.out.println("last modified : "+lastModified);
    }
}
