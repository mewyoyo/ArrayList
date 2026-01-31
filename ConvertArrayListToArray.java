import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("British Columbia");
        cities.add("Sao Paulo");
        cities.add("Rome");
        cities.add("Guatemala");

        String[] cityArray = cities.toArray(new String[0]);

        for(String city : cityArray) {
            System.out.println(city);
        }

    }
}
