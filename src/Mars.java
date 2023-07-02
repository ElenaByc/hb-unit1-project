public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "MyColony";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        System.out.println("Colony name: " + colonyName);
        System.out.println("Ship population: " + shipPopulation);

        // Beginning with the landing process and continuing until food production is underway on Mars,
        // everyone will eat 0.75 meals a day to perserve food. The landing process takes 2 days.
        // Calculate how many meals are left after landing using mathematical operators.
        meals -= 2 * (shipPopulation * 0.75);
        //Print the number of meals that are left.
        System.out.println("The number of meals that are left: " + meals);

        // An extra crate of food is found increasing meals by 50%!
        // Reassign the value of meals to be 50% higher than it was using a mathematical expression.
        meals *= 1.5;

        // The births onboard are very perfectly timed and 5 more babies join
        // the population during the 2 days it takes to land.
        // Reassign shipPopulation to reflect that.
        shipPopulation += 5;
        System.out.println();

        String[] locations = {"The Hill", "The Plain", "The Ocean"};
        // Generate random int value from 0 to 2
        int randomIndex = (int) Math.floor(Math.random() * 3);
        String landingLocation = locations[randomIndex];
        System.out.println("Landing location: " + landingLocation);
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }

        //
        landing = landingCheck((int) Math.floor(Math.random() * 10 + 1));

        System.out.println();
        new GuessingGame();

        System.out.println();
        new MarsExpedition();

        System.out.println();
        new FindingsList();
    }

    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        System.out.println("Minutes left: " + minutesLeft);
        //  Create a for loop that initializes an int variable called minute which is set to 0.
        //  The loop should increment by 1 until it reaches the number of minutesLeft.
        for (int minute = 0; minute <= minutesLeft; minute++) {
            // Inside the loop, create an if statement.
            // If the number of minutes is even print “Right”,
            // if the number of minutes is divisible by 3 print “Left”,
            // if the number is divisible by both 2 and 3 print “Keep Center”.
            // If the number isn’t divisible by any of those factors, print “Calculating”.
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            // Call Thread.sleep(250) after the conditional but before the end of the loop
            // to slow down the console on each loop – it will add to the game ambience.
            Thread.sleep(250);
        }
        // Print “Landed” after the for loop.
        System.out.println("Landed");
        // And then return the boolean false – we’ll save this to the landing variable in the main method
        // since landing will be complete once this function completes.
        return false;
    }
}
