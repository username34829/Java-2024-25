import java.util.Random;
import java.util.Scanner;

public class RockPaperSi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] option = {"Rock", "Paper", "Scissors"};
        String playerChoice = "";
        String botChoice = option[random.nextInt(3)];
        int playerScore = 0;
        int botScore = 0;

        System.out.println("- Welcome to Game of Rock, Paper, Scissors -");
        System.out.println("[System: You are playing against Computer]");
        do {
            System.out.print("Enter Rock, Paper, Scissors, Q (Quit): ");
            playerChoice = scanner.nextLine();

            if (playerChoice.equalsIgnoreCase("Q")) {
                break;
            } else if(!playerChoice.equalsIgnoreCase("Rock") &&
                    !playerChoice.equalsIgnoreCase("Paper") &&
                    !playerChoice.equalsIgnoreCase("Scissors")){
                System.out.println("Invalid input!");
                continue;
            }

            String format = playerChoice.substring(0, 1).toUpperCase();
            String format2 = playerChoice.substring(1).toLowerCase();
            playerChoice = format + format2;

            System.out.println("---------------------------");
            System.out.println("You choose: " + playerChoice);
            System.out.println("Computer choose: " + botChoice);

            if(playerChoice.equals(botChoice)){
                System.out.println("It's a tied!");
            } else if((playerChoice.equals("Rock") && botChoice.equals("Scissors")) ||
                    (playerChoice.equals("Scissors") && botChoice.equals("Paper")) ||
                    playerChoice.equals("Paper") && botChoice.equals("Rock")){
                System.out.println("You win!");
                playerScore++;
            } else{
                System.out.println("You lose!");
                botScore++;
            }
            System.out.println("---------------------------");

        } while (!playerChoice.equalsIgnoreCase("Q"));

        System.out.println("--------------------------------------------");
        System.out.println("Your score: " + playerScore);
        System.out.println("Computer score: " + botScore);

        if (playerScore > botScore) {
            System.out.println("[System: Congrats! You have a greater score than computer!]");
        } else if (playerScore < botScore) {
            System.out.println("[System: Better luck next time!]");
        } else {
            System.out.println("[System: Both player are tied score Congrats both of you!]");
        }
        System.out.println("--------------------------------------------");

        System.out.println("Thank you for using this program!");
        System.out.println("Exiting.....");

        scanner.close();

    }
}
