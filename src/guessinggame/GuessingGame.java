
package guessinggame;
import java.util.Scanner;
public class GuessingGame{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Initialize the game with a range of 1-50 and 5 attempts
        NumberGuessingGame game = new NumberGuessingGame(50, 5);
        
        System.out.println("Guess the number between 1 and 50!");

        // Game loop
        boolean guessedCorrectly = false;
        while (!guessedCorrectly && !game.outOfAttempts()) {
            System.out.println("Enter your guess (Remaining attempts: " + game.getAttempts() + "):");
            int guess = scan.nextInt();
            guessedCorrectly = game.checkGuess(guess);
        }

        // Display the final report
        game.displayReport(guessedCorrectly);
    }
}
    
    

