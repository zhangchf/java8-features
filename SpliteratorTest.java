import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("iteration " + i);
            list.add(i);
            // Spliterator<Integer> split = list.spliterator();
            // split.forEachRemaining(z -> System.out.print(z + " "));

            Iterator<Integer> iter = list.iterator();
            // iter.forEachRemaining(System.out::print);

            while(iter.hasNext()) {
                System.out.print(iter.next());
            }
        }

    }
}