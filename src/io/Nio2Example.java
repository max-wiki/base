package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Nio2Example {
    public static void main(String[] args) throws IOException {
        // nio : new io , add from version 1.4 , java.nio.file : nio2 , add from version 1.7
        // path, paths , files , solve limitation file class java.io.file
        // for example copy file is not exist in java.io.file
        // class paths is a helper class that have only method get
        //  an address that return a path
        // Path path = Paths.get("/home/mohammad/IdeaProjects/base/resources/file.docx");
        // class path detail about file or folder
        // in new version java is better use path instead of file
        // you can cast file to path and on the contray
        // method toFile is in Path and method toPath is in File Class exist.
        // Path parent = Path.getParent();
        // File file = path.toFile();
        // class files is a helper class for copy remove etc.. static methods.
        // for work with symbolic link or properties file
        List<String> lines = Files.readAllLines(Paths.get("/home/mohammad/IdeaProjects/base/resources/mohammad.txt"));
        // for solve problem in collection remove a
        // data and not have problem with next item ,
        // we use from last to first from Collection
        // iterate from last to first
        for(int i = lines.size()-1 ;i >= 0;i--){
            boolean good = lines.get(i).startsWith("good");
            if (good){
                lines.remove(i);
            }
            // method write used utf-8 in implementation
            Files.write(Paths.get("/home/mohammad/IdeaProjects/base/resources/mohammadFour.txt"),lines);
        }

    }
}
