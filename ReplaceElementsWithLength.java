import java.util.ArrayList;

public class ReplaceElementsWithLength {
        public static void main(String[] args) {

            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Kiwi");

            ArrayList<Integer> lengths = new ArrayList<>();

            for(String fruit : fruits) {
                lengths.add(fruit.length());
            }

            System.out.println(lengths);
        }
    }

