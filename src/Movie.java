public class Movie {
    // States
    private String title;
    private String releaseInfo;

    // Constructor
    public Movie(String title, String releaseInfo) {
        setTitle(title);
        setReleaseInfo(releaseInfo);
    }

    // Behaviors
    public void info() {
        System.out.println("The movie is titled: " + title + " and it releases on " + releaseInfo);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseInfo() {
        return releaseInfo;
    }

    public void setReleaseInfo(String releaseInfo) {
        this.releaseInfo = releaseInfo;
    }
}
