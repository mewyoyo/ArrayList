import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceAllElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Violet");

        for(int i=0; i<colors.size(); i++){
            colors.set(i,"Black");
        }
        System.out.println(colors);
    }
}
