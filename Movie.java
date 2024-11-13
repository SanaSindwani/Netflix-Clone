//Class to represent a movie

public class Movie {
    private String title;
    private String genre;
    private int releaseYear;
    private String description;

    public Movie(String title, String genre, int releaseYear, String description) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nGenre: " + genre + "\nRelease Year: " + releaseYear;
    }
}
