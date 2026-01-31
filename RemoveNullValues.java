import java.util.ArrayList;
import java.util.Collections;

public class RemoveNullValues {
        public static void main(String[] args) {

            ArrayList<String> students = new ArrayList<>();
            students.add("Alice");
            students.add(null);
            students.add("Bob");
            students.add(null);
            students.add("Charlie");

            students.removeAll(Collections.singleton(null));

            System.out.println(students);
        }
    }

