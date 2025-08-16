import java.util.Scanner;
public class whileLoop2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        int age = 0;
        
        while(name.isEmpty()){
            System.out.print("Enter name: ");
            name = scanner.nextLine();
        }
        
        do{
            System.out.print("Enter legal age: ");
            age = scanner.nextInt();
            
            if(age < 18){
                System.out.println("That is not legal age.");
            }
            
        }while(age < 18);
        
        System.out.println("Hello " + name);
        System.out.println("You succesfuly enter the legal age " + age);
        
        scanner.close();
        
    }
    
}