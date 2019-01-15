import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

public class FileReadTest extends Utils {
    private static String initString;
    static {
        String currentString = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("initConfig.txt"));
            initString = reader.lines().findFirst().orElse(null);
        } catch (IOException e) {
            throw new NoSuchElementException("File initconfig.txt");
        }
    }

    public FileReadTest() {
        if (initString.length() == 0) {
            throw new IllegalArgumentException("length is 0");
        }
        System.out.println("It works");
    }

    public static void main(String[] args) {
        new FileReadTest();
    }
}