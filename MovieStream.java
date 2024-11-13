//Main Application

import java.util.*;

public class MovieStream {
    private static List<Movie> movies = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample Movies
        movies.add(new Movie("Inception", "Sci-Fi", 2010, "A thief who steals corporate secrets through dream-sharing technology is given the task of planting an idea into the mind of a CEO."));
        movies.add(new Movie("The Dark Knight", "Action", 2008, "Batman sets out to dismantle the remaining criminal organizations that plague Gotham. But the emergence of the Joker forces him to face anarchy."));
        movies.add(new Movie("Interstellar", "Sci-Fi", 2014, "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival."));
        movies.add(new Movie("The Matrix", "Action", 1999, "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers."));
        movies.add(new Movie("The Godfather", "Crime", 1972, "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));

        // Main menu
        while (true) {
            System.out.println("\n--- MovieStream ---");
            System.out.println("1. View All Movies");
            System.out.println("2. Search Movie by Title");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    viewMovies();
                    break;
                case 2:
                    searchMovie();
                    break;
                case 3:
                    System.out.println("Thank you for using MovieStream!");
                    return; // Exit the application
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies available.");
            return;
        }
        System.out.println("\n--- Movie List ---");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).getTitle());
        }
        System.out.print("Select a movie number to see details (0 to go back): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (choice > 0 && choice <= movies.size()) {
            System.out.println("\nMovie Details: ");
            System.out.println(movies.get(choice - 1));
            System.out.println("Description: " + movies.get(choice - 1).getDescription());
        } else if (choice != 0) {
            System.out.println("Invalid choice.");
        }
    }

    private static void searchMovie() {
        System.out.print("Enter movie title to search: ");
        String title = scanner.nextLine();
        boolean found = false;

        System.out.println("\n--- Search Results ---");
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(movie.getTitle() + " (" + movie.getReleaseYear() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found with that title.");
        }
    }
}
