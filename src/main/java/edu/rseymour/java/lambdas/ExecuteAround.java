package edu.rseymour.java.lambdas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ExecuteAround {

    private static final String FILE = ExecuteAround.class.getResource("./data.txt").getFile();

    public static void main(String[] args) throws IOException {


        String result = processFile((BufferedReader br) -> br.readLine() + br.readLine());

        String oneLine = processFile((BufferedReader br) -> br.readLine());

        String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());

    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }

    @FunctionalInterface
    public interface BufferedReaderProcessor {
        String process(BufferedReader b) throws IOException;
    }
}
