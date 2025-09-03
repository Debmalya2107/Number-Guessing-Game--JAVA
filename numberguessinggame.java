/* 
 Number Guessing Game
 Explanation:
 • Use Random class to generate a number between 1–100
 • User tries to guess the number
 • Show hints: “Too low”, “Too high”, “Correct”
 • Track number of attempts 
*/

import java.util.Random;   // Import Random class to generate random numbers
import java.util.Scanner; // Import Scanner class to take input from user

// Main class
public class numberguessinggame {
    public static void main(String[] args) {
        // Create a Random object to generate the number
        Random random = new Random();

        // Generate a random number between 1 and 100
        // nextInt(100) gives values from 0–99, so +1 makes it 1–100
        int numberToGuess = random.nextInt(100) + 1;

        // Variable to track how many guesses the user has made
        int numberOfAttempts = 0;

        // Variable to store the user’s current guess
        int userGuess = 0;

        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Introduction message
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        // Loop continues until the user guesses the correct number
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");

            // Check if input is a valid integer
            if (scanner.hasNextInt()) {
                // Read the guessed number
                userGuess = scanner.nextInt();

                // Increment attempt counter
                numberOfAttempts++;

                // Give hints based on comparison
                if (userGuess < numberToGuess) {
                    System.out.println("Too low"); // Guess is smaller
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high"); // Guess is larger
                } else {
                    // Correct guess
                    System.out.println("Correct! You guessed the number in " + numberOfAttempts + " attempts.");
                }
            } else {
                // If input is not an integer, show error
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Clear invalid input from scanner buffer
            }
        }

        // Close the scanner object (good practice to free resources)
        scanner.close();
    }
}
