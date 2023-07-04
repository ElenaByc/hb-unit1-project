import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // Expedition boot up
        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        Thread.sleep(250);
        System.out.println("...");
        Thread.sleep(250);
        System.out.println("...");
        Thread.sleep(250);
        System.out.println("...");
        Thread.sleep(250);
        System.out.println("Ready");

        // Team setup
        System.out.println("Hi, what is your name?");
        System.out.print("Type in your name: ");
        String name = input.nextLine();

        System.out.println("Hi, " + name + "! Welcome to the Expedition prep program!");
        System.out.println("Are you ready to head out into the new world?");
        System.out.print("Type Y or N ");

        String isReady = input.nextLine();
        if (isReady.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("To bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your expedition team?");
        System.out.print("Input an int number: ");

        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;
        } else {
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("Your team size: " + teamSize);

        // Snack choice
        System.out.println("You are allowed to bring one snack with you. What do you bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you");

        // Choose a Vehicle
        System.out.println("You have the choice of 3 vehicles");
        System.out.println("A: A Mars Rover");
        System.out.println("B: A Chevy Silverado");
        System.out.println("C: A Honda Civic");
        String vehicleChoice = input.next();
        input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Honda Civic";
        } else {
            vehicleChoice = "your feet";
        }

        // The final message
        System.out.println("Your expedition team is now ready!");
        System.out.println("Led by " + name + " with " + teamSize + " teammates.");
        System.out.println("To explore the surface of Mars using " + vehicleChoice + ".");
        System.out.println("Exploration team heads out in");
        System.out.println("5 ...");
        Thread.sleep(250);
        System.out.println("4 ...");
        Thread.sleep(250);
        System.out.println("3 ...");
        Thread.sleep(250);
        System.out.println("2 ...");
        Thread.sleep(250);
        System.out.println("1 ...");
        Thread.sleep(250);
        System.out.println("GO GO GO!");
    }
}
