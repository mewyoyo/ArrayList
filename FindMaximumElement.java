import java.util.ArrayList;
import java.util.Arrays;

public class FindMaximumElement {

    public static String longestMovie(ArrayList<String> movies) {
        String longest = "";

        for (String movie : movies) {
            if (movie.length() >= longest.length()) {
                longest = movie;
            }
        }
        return longest;
    }


    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Titanic");
        movies.add("Avatar");
        movies.add("The Wolf of Wall Street");
        movies.add("Up");

            System.out.println(longestMovie(movies));



    }
}
