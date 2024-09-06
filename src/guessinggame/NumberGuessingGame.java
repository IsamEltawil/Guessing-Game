
package guessinggame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Game class
class NumberGuessingGame {
    private int target;    // The number to guess
    private int attempts;  // Player's remaining attempts
    private ArrayList<Integer> guesses;  // List to store player's guesses

    // Constructor to initialize the game with a fixed range and attempts
    public NumberGuessingGame(int maxRange, int attempts) {
        this.attempts = attempts;
        Random rand = new Random();
        target = rand.nextInt(maxRange) + 1;  // Random number between 1 and maxRange
        guesses = new ArrayList<>();  // Initialize the list of guesses
    }

    // Method to check if the guess is correct
    public boolean checkGuess(int guess) {
        guesses.add(guess);  // Store the player's guess
        attempts--;
        if (guess == target) {
            return true;  // Player guessed correctly
        } else if (guess < target) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
        return false;
    }

    // Method to check if the player has run out of attempts
    public boolean outOfAttempts() {
        return attempts <= 0;
    }

    // Getter for remaining attempts
    public int getAttempts() {
        return attempts;
    }

    // Method to display a final report of the game
    public void displayReport(boolean won) {
        System.out.println("\n=== GAME REPORT ===");
        System.out.println("Correct Number: " + target);
        System.out.println("Your Guesses: " + guesses);
        if (won) {
            System.out.println("Result: You won!");
        } else {
            System.out.println("Result: You lost!");
        }
        System.out.println("===================");
    }
}