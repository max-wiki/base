package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Nio2Example {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("/home/mohammad/IdeaProjects/base/resources/mohammad.txt"));
        // shabih bw collection va container ke agar az akhar be aval nakhoni va yeli ro remove koni va i++ bezani badi ro ke bekhay bekhoni ja be ja mishan va shift mikhoran
        for(int i = lines.size()-1 ;i >= 0;i--){
            boolean good = lines.get(i).startsWith("good");
            if (good){
                lines.remove(i);
            }
            Files.write(Paths.get("/home/mohammad/IdeaProjects/base/resources/mohammadFour.txt"),lines);
        }

    }
}
