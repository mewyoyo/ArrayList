import java.util.ArrayList;

public class ReplaceAllVowels {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Apple");
        words.add("Banana");
        words.add("Sky");
        words.add("Orange");

        for(int i = 0; i < words.size(); i++){
            String newWord = words.get(i).replaceAll("[AEIOUYaeiouy]", "*");
            words.set(i, newWord);
        }
        System.out.println(words);
    }
}
