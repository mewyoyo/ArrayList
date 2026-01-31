import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllMatchingElements {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pear");

        while(fruits.contains("Banana")){
            fruits.remove("Banana");
        }
        System.out.println(fruits);

    }

}
