import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class IOTest {
    public static void main(String[] args) throws Exception {
        File file = new File("Data.txt");
        FileWriter output = new FileWriter(file);


        // for (int i = 0; i < 5; i++) {
        //     output.write(String.valueOf(i));
        // }

        // output.write(new char[] {'0', '1', '2', '3', '4'});

        Stream.of('0', '1', '2', '3', '4').forEach(output::write);

        PrintWriter p = new PrintWriter(output);
        Stream.of('0', '1', '2', '3', '4').forEach(p::write);

        output.flush();
    }
}