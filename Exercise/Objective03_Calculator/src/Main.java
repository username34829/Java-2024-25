import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Objective: Create Calculator

        Scanner scanner = new Scanner(System.in);
        int input;
        double num1;
        double num2;
        double result = 0;

        while (true){
            System.out.println("[Welcome to Java Calculator]");
            menu();

            while (true){
                try{
                    System.out.print("Select Operation: ");
                    input = Integer.parseInt(scanner.nextLine());

                    if(input > 5 || input < 1){
                        System.out.println("[Must not greater or less than Option!]");
                        continue;
                    }
                    break;
                }catch (Exception e){
                    System.out.println("[Something's Wrong, Please Try Again!]");
                }
            }

            if(input == 5){
                System.out.println("Exiting...");
                break;
            }

            while (true){
                try{
                    System.out.print("Enter First Number: ");
                    num1 = Double.parseDouble(scanner.nextLine());

                    if(num1 == 0){
                        System.out.println("[Must not be zero]");
                        continue;
                    }
                    break;
                }catch (Exception e){
                    System.out.println("[Something's Wrong, Please Try Again!]");
                }

            }

            while (true){
                try{
                    System.out.print("Enter Second Number: ");
                    num2 = Double.parseDouble(scanner.nextLine());

                    if(num2 == 0){
                        System.out.println("[Must not be zero]");
                        continue;
                    }
                    break;
                }catch (Exception e){
                    System.out.println("[Something's Wrong, Please Try Again!]");
                }

            }

            switch (input){
                case 1 -> result = num1 + num2;
                case 2 -> result = num1 - num2;
                case 3 -> result = num1 * num2;
                case 4 -> result = num1 / num2;
                default -> System.out.println("[Something's Wrong, Error Occur!]");
            }

            System.out.println("Equal: " + result);
        }

        System.out.println("[Thank you for using this Java Calculator Program.]");
    }

    static void menu(){
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }
}