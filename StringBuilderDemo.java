import java.util.Scanner;

public class StringBuilderDemo extends Utils {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        for (String arg : args) {
            if (str.indexOf(arg) < 1) str.append(arg + " ");
        }

        print(str.toString());

        Scanner sc = new Scanner(str.toString());
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                print(sc.nextInt() + " ");
            } else {
                sc.next();
            }
        }
    }
}