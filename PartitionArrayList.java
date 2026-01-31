import java.util.ArrayList;

public class PartitionArrayList {
    public static void  main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int num : numbers){
            if(num % 2 == 0){
                even.add(num);
            }else {
                odd.add(num);
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
