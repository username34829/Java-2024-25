import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p;

        do {
            // Start
            System.out.println("---------------------------------------");
            System.out.println("|Welcome to the Number Guessing Game! |");
            System.out.println("|Select difficulty level:             |");
            System.out.println("|1. Easy                              |");
            System.out.println("|2. Medium                            |");
            System.out.println("|3. Hard                              |");
            System.out.println("|4. Exit                              |");
            System.out.println("---------------------------------------");
            System.out.print("- ");

            int d = sc.nextInt();
            sc.nextLine();
            
            // Exit
            if (d == 4) {
                System.out.println("---------------------------------------");
                System.out.println("Thank you for playing this game. Bye!");
                break;
            }
            
            // Settings
            int x = 0;
            int low = 0;
            int high = 0;
            
            switch (d) {
                case 1:
                    low = 1;
                    high = 10;
                    x = 6;
                    System.out.print("Guess a number between " + low + " and " + high + ": ");
                    break;
                case 2:
                    low = 1;
                    high = 50;
                    x = 34;
                    System.out.print("Guess a number between " + low + " and " + high + ": ");
                    break;
                case 3:
                    low = 1;
                    high = 100;
                    x = 69;
                    System.out.print("Guess a number between " + low + " and " + high + ": ");
                    break;
                default:
                    System.out.println("Invalid selection. Please select a valid difficulty level.");
                    continue;
            }
            
            // Guesa gamee
            int guess;
            int tries = 0;
            
            do {
                guess = sc.nextInt();
                tries++;
                
                if (guess == x) {
                    System.out.println("---------------------------------------");
                    System.out.println("Congratulations! You guessed the number in " + tries + " tries!");
                } else if (guess > x) {
                    System.out.print("Too high! Guess again. : ");
                } else {
                    System.out.print("Too low! Guess again. : ");
                }
            } while (guess != x);
            
            sc.nextLine();
            
            // y/n Yes(Play again), No(Exit).
            do {
                System.out.println("---------------------------------------");
                System.out.print("Do you want to play again? (Y/N) : ");
                p = sc.nextLine();
                
                if (!p.equals("y") && !p.equals("Y") && !p.equals("n") && !p.equals("N")) {
                    System.out.println("Please select only Y/N, try again.");
                }
                
            } while (!p.equals("y") && !p.equals("Y") && !p.equals("n") && !p.equals("N"));
            
            if (p.equals("n") || p.equals("N")) {
                System.out.println("---------------------------------------");
                System.out.println("Thank you for playing this program. Bye!");
                break;
            }
            
        } while (true);
    }
}
