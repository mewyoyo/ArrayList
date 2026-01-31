import java.util.ArrayList;
import java.util.Collections;

public class RotateElements {
        public static void main(String[] args) {

            ArrayList<String> days = new ArrayList<>();
            days.add("Monday");
            days.add("Tuesday");
            days.add("Wednesday");
            days.add("Thursday");
            days.add("Friday");

            Collections.rotate(days, 2);

            System.out.println(days);
        }
    }

