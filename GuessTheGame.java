import java.io.File;
import java.util.Scanner;

public class GuessTheGame {
    // Get the movies into an array
    // Generate random number
    // Get the movie from the list using generated random number
    // Get input from user
    // Split movie and check if letter is in the string
    // replace at position or decrease chances
    // alert that chances has finished or movie has been found
    // C`est Fini
    public void guess() throws Exception {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        int lineCount = 0;
        // Get length of file i.e number of movies in a file
        while (true) {
            // System.out.println(scanner.nextLine());
            lineCount += 1;
            if (lineCount == 10) {
                break;
            }
        }
        // Create array based on length
        String[] moviesArray = new String[lineCount];
        // add movies to array
        for(int i = 0; i < moviesArray.length; i++) {
            moviesArray[i] = scanner.nextLine();
        }
        int randomNumber = (int) (Math.random() * lineCount);
        // Print array content
        System.out.println(moviesArray.toString());
        scanner.close();
    }
}
