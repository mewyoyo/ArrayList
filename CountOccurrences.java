import java.util.ArrayList;

public class CountOccurrences {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>(); {
            foods.add("Pizza");
            foods.add("Burger");
            foods.add("Pizza");
            foods.add("Pizza");
            foods.add("French fries");
            foods.add("Shaurma");
        }

        int count = 0;

        for(String food : foods) {
            if(food.equals("Pizza")){
                count++;
            };

        }

        System.out.println("Pizza appears: " + count + " times");
    }





}
