# Hackbright Academy - Java course - Unit 1 Project

## Project Overview ##
In this unit, you will be working on the Mars Adventure Game.  
This game is styled after the text adventure games of years past and will allow you to practice your new Java skills.

## MVP ##
**Mars.java**  
Contains a *main* method
  - The main method contains a String, int, double, and boolean
  - Include an if-else statement
  - Call the landingCheck function
  - Instantiate a GuessingGame object
  - Instantiate a MarsExpedition object
  - Instantiate a FindingsList object

Has a function called *landingCheck*
  - The landingCheck function should take in an int and return a boolean
  - Has a for loop, that iterates from 0 to n (the value passed into the int parameter)
  - Has an if-else` statement in the for loop

**GuessingGame.java**  
Contains a public constructor called *GuessingGame*
  - Use Scanner accept the user’s input
  - Has a while loop that contains
    - a try-catch statement for the user guess
    - an if-else statement to check if the guess is correct

**MarsExpedition.java**  
Contains a public constructor called *MarsExpedition*
  - Use Scanner accept the user’s input
  - Use an if-else statement to produce output depending on user input

**FindingsList.java**  
Contains a public constructor called *FindingsList*
  - Create an ArrayList with four strings
  - Remove a string from the ArrayList
  - Create a Hashmap with three strings
  - Use Scanner accept the user’s input
  - Use if-else to check user’s input and output the corresponding value from the HashMap

    
