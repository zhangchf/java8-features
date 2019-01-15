public class LocalClassTest {

    public LocalClassTest() {
        this(10);
    }

    public LocalClassTest(int data) {
        this.data = data;
    }

    public void display() {
        class Decrementer {
            public void decrement() {
                data--;
            }
        }
        Decrementer d = new Decrementer();
        d.decrement();
        System.out.println("data= " + data);
    }

    private int data;
    
    public static void main(String[] args) {
        int data = 0;
        LocalClassTest t = new LocalClassTest();
        t.display();
        System.out.println("data=" + data);
    }
}