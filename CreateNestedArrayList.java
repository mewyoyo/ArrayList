import java.util.ArrayList;
public class CreateNestedArrayList {
        public static void main(String[] args) {

            ArrayList<ArrayList<String>> departments = new ArrayList<>();

            ArrayList<String> it = new ArrayList<>();
            it.add("Alice");
            it.add("Bob");

            ArrayList<String> hr = new ArrayList<>();
            hr.add("Emma");
            hr.add("John");

            ArrayList<String> sales = new ArrayList<>();
            sales.add("Mike");
            sales.add("Sarah");

            departments.add(it);
            departments.add(hr);
            departments.add(sales);

            for(ArrayList<String> dept : departments) {
                System.out.println(dept);
            }
        }
    }
