import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {

        // Storing samples
        Thread.sleep(500);

        System.out.println("Welcome back from your expedition!");
        System.out.println("Time to catalog everything you found.");

        // Create an array that will store string s
        // Add four rocks into your array - rock, weird rock, smooth rock, and not rock
        ArrayList<String> rockList = new ArrayList<String>();
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        // Print a message confirming that everything downloaded
        // and print the list of rocks
        System.out.println("Rock data downloaded.");
        System.out.println(rockList);

        // Remove non-rocks
        Thread.sleep(250);
        System.out.println("Wait a second that last on is not a rock");
        System.out.println("We need to delete that one from the list");
        rockList.remove("not rock");
        System.out.println(rockList);
        System.out.println("Perfect!");

        // Fossils
        Thread.sleep(1000);

        // Create a HashMap that stores elements with 2 attributes
        // (these will be a name and a description), both of which are strings
        HashMap<String, String> fossilDirectory = new HashMap<String, String>();

        // Add 3 fossils and their description to the HashMap
        // Bird Fossil, The fossil has wings implying it was capable of flight
        // Fish Fossil, The fossil is vaguely fish shaped implies there was once water
        // Tooth Fossil, The tooth from an unknown fossil
        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        //Then print “Fossil data downloaded”
        System.out.println("Fossil data downloaded");

        // Let’s make a way for the user to see some information about the fossils.
        System.out.println("Which of the fossils would you like to learn more about?");
        System.out.print("Bird, Fish, or Tooth: ");

        // Save their choice and
        // print information about which fossil they chose
        // using the information stored in your HashMap
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.next();
        input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird") ||
                fossilChoice.equalsIgnoreCase("Fish") ||
                fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice);
            System.out.println("Description: " + fossilDirectory.get(fossilChoice + " Fossil"));
        } else {
            System.out.println("Sorry, there is no data on " + fossilChoice);
        }

        // Special supply list
        Thread.sleep(700);

        // Create an empty HashSet to store the special supplies that you brought on the expedition
        HashSet<String> supplies = new HashSet<>();

        // Use the add method to store at least 3 super important items
        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");
        supplies.add("Something");

        // Now, use the remove method to remove one of your items
        supplies.remove("Something");

        // Print the remaining supplies, label them something like “Supplies After Expedition”
        System.out.println();
        System.out.println("Supplies After Expedition");
        // create Iterator object
        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        // another way to print HashSet
        System.out.println(supplies);

    }
}
