import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int dice;
		int roll = 0;
		int total = 0;
		
		System.out.print("Enter the number of dice: ");
		dice = scanner.nextInt();
		
		if(dice > 0){
		    
		    for(int i = 1; i <= dice; i++){
		        roll = random.nextInt(6);
		        if(roll == 0){
		            roll = 1;
		        }
		        System.out.println("The #" + i + " die");
		        die(roll);
		        
		        total = roll + total;
		    }
		    
		    
		    System.out.println("The total # of dice: " + total);
		    
		}
		else{
		    System.out.println("Invalid number!");
		}
	}
	
	static void die(int roll){
	    
	    switch(roll){
	        case 1: die1();
	        break;
	        case 2: die2();
	        break;
	        case 3: die3();
	        break;
	        case 4: die4();
	        break;
	        case 5: die5();
	        break;
	        case 6: die6();
	        break;
	        default: System.out.println("-Error-");
	        break;
	    }
	    
	}
	
	static void die1(){
	    System.out.println(" -----");
	    System.out.println("|     |");
	    System.out.println("|  *  |");
	    System.out.println("|     |");
	    System.out.println(" -----");
	}
	static void die2(){
	    System.out.println(" -----");
	    System.out.println("|*    |");
	    System.out.println("|     |");
	    System.out.println("|    *|");
	    System.out.println(" -----");
	}
	static void die3(){
	    System.out.println(" -----");
	    System.out.println("|*    |");
	    System.out.println("|  *  |");
	    System.out.println("|    *|");
	    System.out.println(" -----");
	}
	static void die4(){
	    System.out.println(" -----");
	    System.out.println("|*   *|");
	    System.out.println("|     |");
	    System.out.println("|*   *|");
	    System.out.println(" -----");
	}
	static void die5(){
	    System.out.println(" -----");
	    System.out.println("|*   *|");
	    System.out.println("|  *  |");
	    System.out.println("|*   *|");
	    System.out.println(" -----");
	}
	static void die6(){
	    System.out.println(" -----");
	    System.out.println("|*   *|");
	    System.out.println("|*   *|");
	    System.out.println("|*   *|");
	    System.out.println(" -----");
	}
}