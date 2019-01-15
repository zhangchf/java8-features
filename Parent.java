public class Parent extends Utils {
    protected static int count = 0;
    public Parent() {
        print("parent constructor");
        count++;
    }
    static int getCount() {
        return count;
    }
}