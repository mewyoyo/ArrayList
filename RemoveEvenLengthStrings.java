import java.util.ArrayList;

public class RemoveEvenLengthStrings {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Finn");
        names.add("Ann");
        names.add("Lemon");
        names.add("Oscar");

        for(int i = names.size() - 1; i >= 0; i--){
            if(names.get(i).length() % 2 == 0){
                names.remove(i);
            }
        }
        System.out.println(names);
    }
}
