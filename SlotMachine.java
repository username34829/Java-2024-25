import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args){

        //Slot Machine Java Game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int bet;
        double payout = 0;
        double balance = 100;
        String[] rows = {"🍍", "🍎", "🍓", "🍇", "\uD83C\uDF1F"};
        String[] rowYouGet = new String[3];
        String playAgain = "";
        boolean invalid = true;

        do{

            System.out.println("--------------------");
            System.out.println("Welcome to java slot");
            System.out.println("--------------------");
            System.out.println("Symbols: \uD83C\uDF4D\uD83C\uDF4E\uD83C\uDF53\uD83C\uDF47\uD83C\uDF49\uD83C\uDF1F");
            System.out.println("Current Balance: " + balance);
            System.out.println("--------------------");
            System.out.print("Enter bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet < 0 || bet > balance){
                System.out.println("[Bet must not be greater or less than balance]");
                continue;
            }

            System.out.println("Spinning...");

            for(int i = 0; i < 3; i++){
                rowYouGet[i] = rows[random.nextInt(5)];
                System.out.print(rowYouGet[i] + " | ");
            }
            System.out.println();
            payout = payouts(rowYouGet);
            if(payout == 0){
                balance -= bet;
            }
            else{
                payout *= bet;
                balance += payout;
            }

            System.out.printf("You win: %.1f$\n", payout);
            System.out.printf("Current balance: %.1f$\n", balance);

            while(invalid){
                System.out.print("Do you want to play again (Y/N): ");
                playAgain = scanner.nextLine().toLowerCase();

                if(!playAgain.equalsIgnoreCase("n") && !playAgain.equalsIgnoreCase("y")){
                    System.out.println("[System: Enter Y for (Yes) & N for (No)]");
                }
                else {
                    invalid = false;
                }
            }

            if(!invalid){
                invalid = true;
            }

        }while(!playAgain.equalsIgnoreCase("n"));

        System.out.println("----------------------");
        System.out.println("Thank you for playing!");
        System.out.println("----------------------");
    }
    static double payouts(String[] row){
        double payout = 0;
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            switch (row[0]){
                case "🍍" -> payout = 3;
                case "🍎" -> payout = 4;
                case "🍓" -> payout = 5;
                case "🍇" -> payout = 10;
                case "\uD83C\uDF1F" -> payout = 20;
            }
        }
        else if(row[0].equals(row[1])){
            switch (row[0]){
                case "🍍" -> payout = 2;
                case "🍎" -> payout = 3;
                case "🍓" -> payout = 4;
                case "🍇" -> payout = 7;
                case "\uD83C\uDF1F" -> payout = 10;
            }
        }
        else if(row[1].equals(row[2])){
            switch (row[1]){
                case "🍍" -> payout = 2;
                case "🍎" -> payout = 3;
                case "🍓" -> payout = 4;
                case "🍇" -> payout = 7;
                case "\uD83C\uDF1F" -> payout = 10;
            }
        }
        return payout;
    }
}
