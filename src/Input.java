import java.util.Scanner;
public class Input {
    public static void main(String[] args) {

        // Properties

        int yearOfFilmRelease;
        String filmName;
        Double filmRating;

        Scanner input = new Scanner(System.in);

        // Input's

        System.out.println("What film name?");
        filmName = input.nextLine();

        System.out.println("What year was the film released?");
        yearOfFilmRelease = input.nextInt();

        System.out.println("What rating film?");
        filmRating = input.nextDouble();

        // Out

        System.out.println("Data Film:");
        System.out.println(filmName);
        System.out.println(yearOfFilmRelease);
        System.out.println(filmRating);
    }
}
