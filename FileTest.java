import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest extends Utils {
    public static void main(String[] args) {
        Path inputFile = Paths.get("input.txt");
        Path outputFile = Paths.get("output.txt");

        BufferedReader reader = Files.newBufferedReader(inputFile, Charset.defaultCharset());
        BufferedWriter writer = Files.newBufferedWriter(outputFile, Charset.defaultCharset());
        String line = "";
        while((line = reader.readLine()) != null) {
            writer.append(line);
        }
    }
}