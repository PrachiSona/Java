import java.util.Scanner;
import java.util.Random;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 5;
        int round = 1;
56
        while (true) {
            System.out.println("TASK 1 - Number Game - Round " + round);
            int generatedNumber = random.nextInt(100) + 1;
            int attemptsLeft = attempts;

            System.out.println("A random number is generated between 1 and 100. You have " + attemptsLeft + " attempts to guess it.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess < generatedNumber) {
                    System.out.println("Number Too low!");
                } else if (userGuess > generatedNumber) {
                    System.out.println("Number Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number: " + generatedNumber);
                    break;
                }

                attemptsLeft--;
            }

            if (attemptsLeft == 0) {
                System.out.println("You have no attempts left. The correct number was: " + generatedNumber);
            }

            System.out.print("Do you want to play again?(yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            round++;
        }

        System.out.println("Thanks for playing!");
    }
}