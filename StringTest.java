public class StringTest extends Utils {
    public static void main(String[] args) {
        String s1 = "My String";
        String s2 = new String("My String");

        print(s1.matches(s2));
        print(s1 == s2);
        print(s1.equals(s2));
        print(s1.hashCode() == s2.hashCode());


    }

}