package golde.comet.assessment.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFile {

    public static void main(String[] args) {
        String filePath = "src/main/resources/Test.txt";



        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
