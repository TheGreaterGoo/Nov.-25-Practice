import java.util.Scanner;
public class Runner {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the title of the upcoming movie?");
        String title1 = scan.nextLine();

        System.out.println("When does this movie release?");
        String release1 = scan.nextLine();

        Movie movie1 = new Movie(title1, release1);
        Movie movie2 = new Movie("Super Mario Movie", "N/A release date");

        movie1.info();
        System.out.println("Here is information about another announced movie:");
        movie2.info();
    }
}