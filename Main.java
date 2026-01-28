import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("The Shawshank Redemption");
        books1.add("The Lord of the Rings");
        books1.add("The Foxtrot");
        books1.add("The Da Vinci Code");

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("The Holy Seeing");
        books2.add("The Justice of Crows");
        books2.add("The Da Vinci Code");
        books2.add("The Lord of the Rings");

        ArrayList<String> allbooks = new ArrayList<>();

        for (String book : books1) {
            allbooks.add(book);
        }

        for (String book : books2) {
            if (!allbooks.contains(book)) {
                allbooks.add(book);
            }
        }
        System.out.println("List of all books = " + allbooks);
    }
}