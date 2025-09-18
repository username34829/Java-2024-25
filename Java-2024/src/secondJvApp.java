import java.util.Scanner;
public class secondJvApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enter = 0;
        
        String[] name = {"Joshan", "Aviles", "Lucmayan"};
        try {
            do { 
             
            
                System.out.println("Enter number ");
                System.out.println("1. Your First Name");
                System.out.println("2. Your Middle Name");
                System.out.println("3. Your Surname");
                System.out.println("4. Show Fullname");
                System.out.println("5. Exit");
                System.out.print("- > ");
                enter = sc.nextInt();
                
                System.out.println();
                System.out.println("----------------------------");
                switch(enter) {
                    case 1: System.out.println("Your name is " + name[0]);
                    break;
                    case 2: System.out.println("Your middle name is " + name[1]);
                    break;
                    case 3: System.out.println("Your Surname is " + name[2]);
                    break;
                    case 4: System.out.println("Your Fullname is " + name[0] + " " + name[1] + " " + name[2]);
                    break;
                    case 5: System.out.println("Thank you for using this program.");
                    break;
                    default: System.out.println("Please select 1 to 5 only!");
                    break;
                }
                System.out.println("----------------------------");
                System.out.println();
            
            
            
            
            }while(enter!=5);
        
        }catch (Exception e) { System.out.println("Error: Exiting..."); }
        
    }
        
    
}