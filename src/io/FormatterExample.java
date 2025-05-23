package io;

import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        /* this class exist in java.util . is for create text format output
         Formatter formatter = new Formatter(new FileWriter("/home/mohammad/IdeaProjects/base/resources/mohammad.txt"));
           formatter = new Formatter(new FileOutputStream("/home/mohammad/IdeaProjects/base/resources/mohammad.txt"));
             formatter = new Formatter(new File("/home/mohammad/IdeaProjects/base/resources/mohammad.txt"));*/
        Formatter formatter = new Formatter(System.out);
        // have format method
        formatter.format("age=%d,name=%s,grade=%.2f", 20, "ali", 18.345);
        formatter.close();
    }
}
