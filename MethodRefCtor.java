import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodRefCtor {

    static void populate(Supplier<List> s, String... stuff) {
        List ss = s.get();
        for (int i = 0; i < stuff.length; i++) {
            System.out.println(stuff[i]);
            ss.add(stuff[i]);
        }
        System.out.println(ss);
    }


    public static void main(String[] args) {
        MethodRefCtor mrc = new MethodRefCtor();
        populate(ArrayList::new, "Red", "Green", "Blue");
    }
}