import java.util.ArrayList;

public class FindSecondLargestElement {
        public static void main(String[] args) {

            ArrayList<String> movies = new ArrayList<>();
            movies.add("Titanic");
            movies.add("Avatar");
            movies.add("The Wolf of Wall Street");
            movies.add("Up");

            String longest = "";
            String second = "";

            for(String movie : movies) {
                if(movie.length() > longest.length()) {
                    second = longest;
                    longest = movie;
                } else if(movie.length() > second.length() && !movie.equals(longest)) {
                    second = movie;
                }
            }

            System.out.println("Second longest movie: " + second);
        }
    }
