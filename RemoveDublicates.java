import java.util.ArrayList;

public class RemoveDublicates {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Owl");
        animals.add("Rabbit");
        animals.add("Owl");
        animals.add("Cat");
        animals.add("Rabbit");

        ArrayList<String> unique = new ArrayList<>();

        for(String animal: animals){
            if(!unique.contains(animal)){
                unique.add(animal);
            }
        }

        System.out.println(unique);

    }
}
