public class OverrideTest extends Utils {

    public static void main(String[] args) {
        SuggestionBox sb = new SuggestionBox() {
            public void onSelection() {
                print("office selected");
            }
            public void onRemoveSelection() {
                onSelection();
                print("office removed");
            }
        };
        System.out.println(sb);
        sb.onRemoveSelection();
    }
}