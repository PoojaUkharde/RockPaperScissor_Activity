import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Type rock, paper, or scissors to play. Type quit to exit.");

        while (true) {
            System.out.print("Your choice: ");
            userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
    }
}