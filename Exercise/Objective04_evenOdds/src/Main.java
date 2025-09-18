import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        //Objectives: Create Odds and Even Checker

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("[This program will determine if the num you enter is Even Or Odds]");
        System.out.println("(enter \"exit\" to exit this program)");

        while(true){
            try{
                System.out.print("Enter Number: ");
                input = scanner.nextLine();
            }catch (Exception e){
                System.out.println("[Something went wrong, Please Try Again!]");
                continue;
            }

            if(input.isEmpty()){
                System.out.println("[You enter nothing]");
                continue;
            }
            else if(!input.matches("[0-9]+") && !input.equalsIgnoreCase("exit")){
                System.out.println("[You cannot enter other things, its either number or \"exit\" only!]");
                continue;
            }

            if(input.equalsIgnoreCase("exit")){
                System.out.println();
                System.out.println("[You exit the program]");
                System.out.println("Thank you for using this program!");
                break;
            }

            int num = Integer.parseInt(input);

            if(num % 2 == 0){
                System.out.println("The number you type is Even!");
            }
            else if (num % 2 == 1){
                System.out.println("The number you type is Odds!");
            }

        }

    }
}
