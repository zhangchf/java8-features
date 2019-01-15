import java.io.FileReader;

public class Test {

    private static int count;
    static {
        System.out.println("In block 1");
        count = 10;
    }
    
    private int[] data;
    {
        System.out.println("block 2");
        data = new int[count];
        for (int i = 0; i < count; i++) {
            data[i] = i;
        }
    }

    public static void main(String[] args) {
        print("Count: " + count);
        print("before 1st call");
        Test t1 = new Test();
        print("best 2nd new");
        Test t2 = new Test();
        
    }

    private static void print(String msg) {
        System.out.println(msg);
    }
}