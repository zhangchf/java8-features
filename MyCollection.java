import java.util.Set;


public class MyCollection<T> {
    private Set<T> set;
    public Set<T> getCollection() {
        return this.set;
    }

    public void testCollection(MyCollection<?> collection) {
        Set set = collection.getCollection();
    }

    public static void main(String[] args) {
        
        MyCollection<Integer> myCollection = new MyCollection<>();
        myCollection.testCollection(myCollection);
    }
}