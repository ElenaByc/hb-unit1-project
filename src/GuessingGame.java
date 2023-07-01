import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame {
    public GuessingGame() {
        System.out.println("Howdy, what's your name?");
        System.out.print("Type in your name: ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // create an instance of the Random object
        Random rand = new Random();
        // call method nextInt and pass in upper range bound
        int number = rand.nextInt(100);

        System.out.println(name + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

//        System.out.println("number: " + number);

        int tries = 0;
        int guess = 0;

        while (guess != number) {
            System.out.print("Your guess? ");

            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                // need to progress past bad input
                String bad_input = input.nextLine();
                System.out.println("You entered: " + bad_input);
                System.out.println("That's not an integer, please try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, please try again");
                continue;
            }

            tries = tries + 1;

            if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done, " + name + "!");
                System.out.println("You found my number in " + tries + " tries!");
            }
        }
    }
}
