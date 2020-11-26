public class Movie {
    // States
    public String title;
    public String releaseInfo;

    // Constructor
    public Movie(String title, String releaseInfo) {
        this.title = title;
        this.releaseInfo = releaseInfo;
    }

    // Behaviors
    public void info() {
        System.out.println("The movie is titled: " + title + " and it releases on " + releaseInfo);
    }
}
