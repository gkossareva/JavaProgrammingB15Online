package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WordFreqencyFromTheFile {
    public static void main(String[] args) {


     try {
        List<String> allLines = Files.readAllLines(Paths.get("/Users/galinakossareva/IdeaProjects/JavaProgrammingB15Online/src/day63/map"));
        System.out.println("allLines = " + allLines);

    } catch (IOException e) {
        System.out.println("ERROR@@@!!!!!");
    }
}
}