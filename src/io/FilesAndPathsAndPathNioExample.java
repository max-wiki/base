package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesAndPathsAndPathNioExample {
    public static void main(String[] args) {
        Path path = Paths.get("/home/mohammad/IdeaProjects/base/resources/mohammad.txt");
        if (!Files.exists(path)) return;
        try {
            // create new folder
            if (!Files.exists(Paths.get("/home/mohammad/IdeaProjects/base/resources/files")))
            Files.createDirectory(Paths.get("/home/mohammad/IdeaProjects/base/resources/files"));
           // address to link path
            if (!Files.exists(Paths.get("/home/mohammad/IdeaProjects/base/resources/r.txt"))){
          Files.createSymbolicLink(Paths.get("/home/mohammad/IdeaProjects/base/resources/r.txt"), path);
            }
            byte[] bytes = Files.readAllBytes(path);
            // for read all text from text file
            List<String> strings = Files.readAllLines(path);
            boolean writable = Files.isWritable(path);
            long size = Files.size(path);
            Path copy = Paths.get("/home/mohammad/IdeaProjects/base/resources/files/file");
            // get path and byte array save to path
            Files.write(copy,bytes);
            // StandardOpenOption append to path and not write again
            Files.write(copy,bytes, StandardOpenOption.APPEND);
            // copy from one path to another path
            Files.copy(Paths.get("/home/mohammad/IdeaProjects/base/resources/files/file"),Paths.get("/home/mohammad/IdeaProjects/base/resources/files/fileTwo"));
            Files.delete(Paths.get("/home/mohammad/IdeaProjects/base/resources/files/file"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
