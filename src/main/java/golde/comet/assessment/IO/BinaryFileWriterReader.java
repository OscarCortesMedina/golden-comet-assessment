package golde.comet.assessment.IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BinaryFileWriterReader {

    public static void main(String[] args) {
        Path sourceFile = Paths.get("src/main/resources/solana_counter.so");
        Path targetFile = Paths.get("src/main/resources/solana_counter_back.so");

        try {
            // Read!
            byte[] bytes = Files.readAllBytes(sourceFile);

            // Write!
            Files.write(targetFile, bytes);

            System.out.println("Binary file read and write successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}