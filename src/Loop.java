import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        // Constant's

        int maxIter = 3;

        // Properties

        double filmRating;
        double totalRating = 0.0;
        double midRatingOfFilm;

        Scanner input = new Scanner(System.in);

        // Loop (For)

        System.out.println("Loop (For)");
        for (int i = 0; i < maxIter; i++) {
            System.out.println("(Assessment - "+ i +1 +") Add a note for the movie (0,0 - 10,0)");
            filmRating = input.nextDouble();
            totalRating += filmRating;
        }

        midRatingOfFilm = totalRating/maxIter;
        System.out.println("Mid rating of Film: " + midRatingOfFilm);

        // Loop (While)

        totalRating = 0.0;

        System.out.println("Loop (While)");
        int iter = 0;
        while (iter < maxIter) {
            System.out.println("(Assessment - "+ iter +1 +") Add a note for the movie (0,0 - 10,0)");
            filmRating = input.nextDouble();
            totalRating += filmRating;
            iter ++;
        }

        midRatingOfFilm = totalRating/maxIter;
        System.out.println("Mid rating of Film: " + midRatingOfFilm);
    }
}
