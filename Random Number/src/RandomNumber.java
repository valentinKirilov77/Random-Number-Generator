import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main ( String[] args ) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Rules: if you enter an invalid number you lose!");
        System.out.println("Good luck");
        System.out.println();
        System.out.println("Choose a range of numbers: ( 1 / 2147483647 )");

        int number = scanner.nextInt();
        int randomNumber = random.nextInt(number) +1;
        int tryCount = 0;

        while (true) {
            System.out.println("GO!");
            System.out.printf("Enter your guess (1- %d):", number);
            System.out.println();
            int playerGuess = scanner.nextInt();
            tryCount++;
            if (playerGuess < 1 || playerGuess > number){
                System.out.println("Invalid number! You lose.");
                break;
            }
            if (playerGuess == randomNumber) {
                System.out.println("Correct! You guessed the number!");
                System.out.println("It took you " + tryCount + " tries.");
                if (tryCount <= 5) {
                    System.out.println("You did it like a pro!");
                }else if (tryCount <= 10) {
                    System.out.println("You are getting better!");
                }else if (tryCount > 11) {
                    System.out.println("You still have a lot to learn.");
                }
                break;
            }
            else if (randomNumber > playerGuess) {
                System.out.println("No! Guess higher!");
            }
            else if (randomNumber < playerGuess) {
                System.out.println("No! Guess lower!");
            }

        }
    }
}