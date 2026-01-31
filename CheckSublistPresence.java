import java.util.ArrayList;

public class CheckSublistPresence {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<>();

        sports.add("Football");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Valleyball");
        sports.add("Athletics");

        ArrayList<String> check = new ArrayList<>();
        check.add("Football");
        check.add("Basketball");
        check.add("Hockey");

        if(sports.containsAll(check)) {
            System.out.println("Sports list contains everything");
        }else {
            System.out.println("Not all found");
        }

    }
}
