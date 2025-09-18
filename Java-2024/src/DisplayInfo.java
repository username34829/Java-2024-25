import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int enter;
		int age = 0;
		String name = "";
		
		
		try {
			
			do{
				
				String DisplayInfo = String.format("Your name is %s Your age is %s",name, age);
				
				System.out.println("\nSelect one of these:" + 
		                   "\n1. Enter name" + 
		                   "\n2. Enter age" + 
		                   "\n3. Display information" + 
		                   "\n4. Exit");
		        System.out.print("-");
		        enter = sc.nextInt();
		        sc.nextLine();
		        switch(enter){
		        	case 1:
		        	       System.out.print("Enter your name: ");
		        	       name = sc.nextLine();
		        	       break;
		        	case 2:
		        	       System.out.print("Enter age: ");
		        	       age = sc.nextInt();
		        	       break;
		        	case 3:
		        	      System.out.println(DisplayInfo);
		        	      break;
		        	case 4:
		        	      System.out.println("Thank you for using this program");
		        	      System.exit(0);
		        }
		        
				
				
			}while(true);
		}catch (Exception ex) {
			System.out.println("Exiting...");
		}
		 
		 
		                  
	}
}