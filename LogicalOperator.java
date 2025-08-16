import java.util.Scanner;
public class LogicalOperator {
    
    public static void main(String[] args) {
        // && - all must be true
        // || - one of them must be true
        // !  - not true
        
        String username;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Username: ");
        username = scanner.nextLine();
        
        if(username.contains(" ") || username.contains("_")){
            System.out.println("User name must not contain spaces or underscore.");
        }
        else if(username.length() < 4 || username.length() > 12){
            System.out.println("User name must be between 4 to 12 Character");
        }
        else{
            System.out.println("Welcome " + username);
        }
        
        
        
    }
    
}