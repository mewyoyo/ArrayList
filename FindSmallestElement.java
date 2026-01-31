import java.util.ArrayList;

public class FindSmallestElement {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();

        songs.add("WHITE");
        songs.add("3S'");
        songs.add("Molly");
        songs.add("Witness");

        String shortest = songs.get(0);

        for(String song : songs){
            if(song.length() < shortest.length()){
                shortest = song;
            }
        }
        System.out.println("Shortest song - " + shortest);



    }
}
