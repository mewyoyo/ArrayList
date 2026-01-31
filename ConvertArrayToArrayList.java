import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));

        list.add(10);
        System.out.println(list);

    }
}
