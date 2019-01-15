import java.math.BigDecimal;

public class InterfaceTest {

    public interface Account {
        BigDecimal balance = new BigDecimal(0.00);
    }

    public class SavingsAccout implements Account {
        public SavingsAccout(BigDecimal initialValue) {
            balance = initialValue;
        }

        public String toString() {
            return balance.toString();
        }
    }

    public static void main(String[] args) {
        InterfaceTest it = new InterfaceTest();
        
        SavingsAccout instance = it.new SavingsAccout(new BigDecimal(50.00));
        System.out.println(instance);
    }
}