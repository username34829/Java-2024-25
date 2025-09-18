import java.util.Scanner;
public class subString {
    
    public static void main(String[] args) {
        String enterName = "";
        String low = "";
        String upp = "";
        String formattedFirstName =  "";
        String formattedLastName = "";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first & last name: ");
        enterName = scanner.nextLine();
        
        System.out.println("Converted result: ");
        System.out.println();
        
        low = enterName.toLowerCase();
        
        upp = enterName.toUpperCase();
        
        if(enterName.contains(" ")){
            String[] name = enterName.split(" ");
            
            String firstName = name[0];
            String lastName = name[1];
            formattedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
            formattedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

            
        }
        
        System.out.println("Low Case: " + low);
        System.out.println("Upp Case: " + upp);
        System.out.println("Format Case: " + formattedFirstName + " " + formattedLastName);
            
            
            scanner.close();
    }
    
}