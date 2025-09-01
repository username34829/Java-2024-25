import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        // Objective: Create a program that can input and view arrayList
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        int choice;
        String name;

        do{
            System.out.println("Account Section");
            System.out.println("1. Add Name");
            System.out.println("2. View");
            System.out.println("3. Exit");
            System.out.print("- > ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    names.add(name);
                    break;
                case 2:
                    System.out.println(names);
                    break;
                case 3:
                    System.out.println("Thank you for using this program!");
                    break;
                default:
                    System.out.println("Somethings Wrong, Please Try Again!");
                    break;
            }
        }while(choice != 3);


        scanner.close();
    }
}
