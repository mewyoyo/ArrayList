import java.util.ArrayList;

public class FindIndexOfElement {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>();

        flowers.add("Snowdrop");
        flowers.add("Rose");
        flowers.add("Asphodel");
        flowers.add("Rose");
        flowers.add("Hyacinth");

        int first = flowers.indexOf("Rose");
        int last = flowers.lastIndexOf("Rose");

        System.out.println("First index is " + first);
        System.out.println("Last index is " + last);

    }
}
