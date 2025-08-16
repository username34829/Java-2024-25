import java.util.Scanner;
public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// BANK ACCOUNT
		
		
		double balance = 0;
		boolean isRunning = true;
		int amount = 0;
		
		while(isRunning){
		    
		    System.out.println("$ BANK ACCOUNT $");
	    	System.out.println("1. Show Balance");
	    	System.out.println("2. Deposit");
	    	System.out.println("3. Widraw");
	    	System.out.println("4. Exit");
    		System.out.print("- > ");
		
	    	int choice = scanner.nextInt();
	    	
            System.out.println("-------------------------------");
		    
    		switch(choice){
		        case 1: showBalance(balance);
		        break;
		        case 2: balance += deposit();
		        break;
		        case 3: balance -= widraw(balance);
		        break;
		        case 4: isRunning = false;
		                System.out.println("Thank you! Have a great day.");
	    	    break;
		        default: System.out.println("Invalid choice!");
		        break;
    		}
    		
    		System.out.println("-------------------------------");
	    		
		    
		}
		
	}
	static void showBalance(double balance){
	    System.out.printf("$%.2f\n",balance);
	}
	static double deposit(){
	    System.out.print("Enter Deposit: ");
	    double amount = scanner.nextInt();
	    
	    if(amount < 0){
	        System.out.println("-------------------------------");
	        System.out.println("Invalid Input!");
	        return 0;
	    }
	    
	    
	    return amount;
	}
	static double widraw(double amount){
	    
	    System.out.print("Enter amount to widraw: ");
	    double widraw = scanner.nextDouble();
	    
	    if(widraw > amount){
	        System.out.println("-------------------------------");
	        System.out.println("Insuffixnt");
	        return 0;
	    }
	    return widraw;
	}
	
}