import java.util.ArrayList;

public class FindCommonElement {
    public static void main(String[] args) {
        ArrayList<String> countries1 = new ArrayList<>();

        countries1.add("Russia");
        countries1.add("Kazakhstan");
        countries1.add("New Zealand");
        countries1.add("Kyrgyzstan");
        countries1.add("Saudi Arabia");

        ArrayList<String> countries2 = new ArrayList<>();

        countries2.add("China");
        countries2.add("Japan");
        countries2.add("New Zealand");
        countries2.add("Kyrgyzstan");
        countries2.add("South Korea");

        ArrayList<String> common = new ArrayList<>();
        for(String country : countries1) {
            if(countries2.contains(country)) {
                common.add(country);
            }
        }
        System.out.println(common);
    }
}
