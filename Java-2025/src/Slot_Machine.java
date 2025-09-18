import java.util.Random;
import java.util.Scanner;

public class Slot_Machine {
	public static void main(String[] args){
	    
	    String[] slot = {"🍕", "🍖", "🍉", "🍎","🍟", "🌟", "7️⃣"};
	    Random random = new Random();
	    Scanner scanner = new Scanner(System.in);
	    int userPlay = 0;
	    int toCasino = 0;
	    int bet = 0;
	    int balance = 100;
	    char c = '$';
	    String enter = "";
	    

	    do{ 
	        
	        String Result = randomSlot(slot, random);
	        String Result2 = randomSlot2(slot, random);
	        String Result3 = randomSlot3(slot, random);
	        
	        System.out.println("*****************");
	        System.out.println("Slot Machine Java");
	        System.out.println("*****************");
	        System.out.println("| " + Result + 
	                               " | " + Result2 +
	                                   " | " + Result3 + " | ");                           
	        System.out.println("*****************");
	        System.out.println("      7 7 7      ");
	        System.out.println("   - Jackpot -   ");
	        System.out.println("*****************");
	        
	        if(userPlay > 0){
	            
	            int winTwo = winTwo(Result, Result2, Result3);
	            int winThree = winThree(Result, Result2, Result3);
	            
	            if(winTwo > 2 && winTwo <= 20){
	                bet = bet * winTwo;
	                System.out.println("You Win " + bet + c);
	                balance = balance + bet;
	            }
	            else if(winThree > 5 && winThree <= 40){
	                bet = bet * winThree;
	                System.out.println("You Win " + bet + c);
	                balance = balance + bet;
	            }
	            else{
	                System.out.println("You lose, Better luck next time!");
	                balance = balance - bet;
	            }
	            
	            
	            System.out.print("Play again? (y/n) -> ");
	            enter = scanner.nextLine().toLowerCase();
	            
	            
	            if(enter.equals("n")){
	                System.out.print("Do you want to exit? press (e) \n" + 
	                                   "or back to the game? press (b) -> ");
	                enter = scanner.nextLine();
	                if(enter.equals("b")){
	                    userPlay = 0;
	                    continue;
	                }
	                else{
	                     System.out.println("***********************************");
	                     System.out.println("Thank you for playing this program!");
	                     System.exit(0);
	                }
	            }
	            else if(enter.equals("y")){
	                userPlay = 0;
	                continue;
	            }
	        }
	        
	        System.out.println("Your Balance: " + balance + c);
	        System.out.print("Place your bet: ");
	        bet = scanner.nextInt();
	        scanner.nextLine();
	        
	        if(bet > balance){
	            System.out.println("Insuffixent Balance!");
	            continue;
	        }
	        else if(bet <= 0){
	            System.out.println("Bet cannot be less than zero!");
	            continue;
	        }
	        
	        System.out.print("Pull the Lever? (y/n) -> ");
	        enter = scanner.nextLine().toLowerCase();
	        if(enter.equals("y")){
	            System.out.println("Spinning....");
	            userPlay = userPlay + 1;
	        }
	        else{
	            System.out.print("Want to change the bet press(b) \n" + 
	                             "or exit press (e)? -> ");
	            enter = scanner.nextLine();
	            
	            if(enter.equals("b")){
	                System.out.println("Your balance: " + balance + c);
	                System.out.print("Place your bet: ");
	                bet = scanner.nextInt();
	                scanner.nextLine();
	                
	                System.out.print("Pull the lever? (y/n) -> ");
	                enter = scanner.nextLine().toLowerCase();
	                if(enter.equals("y")){
	                userPlay = userPlay + 1;
	                }
	            }
	        }
	    
	    }while(!enter.equals("e"));
	    
	    System.out.println("***********************************");
	    System.out.println("Thank you for playing this program!");
	    
	    scanner.close();
	}
	
	
	//Random slot
	static String randomSlot(String[] slot, Random random){
	    String randomSlot = slot[random.nextInt(7)];
	    return randomSlot;
	}
	static String randomSlot2(String[] slot, Random random){
	    String randomSlot = slot[random.nextInt(7)];
	    return randomSlot;
	}
	static String randomSlot3(String[] slot, Random random){
	    String randomSlot = slot[random.nextInt(7)];
	    return randomSlot;
	}
	
	//If theres two matches in slot
	static int winTwo(String result, String result2, String result3){
	    int win = 0;
	    
	    if(result.equals(result2)){
	        switch(result){
	            case "🍕": win = 3;
	            break;
	            case "🍖": win = 4;
	            break;
	            case "🍉": win = 5;
	            break;
	            case "🍎": win = 7;
	            break;
	            case "🍟": win = 10;
	            break;
	            case "🌟": win = 15;
	            break;
	            case "7️⃣": win = 20;
	            break;
	        }
	    }
	    if(result2.equals(result3)){
	        switch(result){
	            case "🍕": win = 3;
	            break;
	            case "🍖": win = 4;
	            break;
	            case "🍉": win = 5;
	            break;
	            case "🍎": win = 7;
	            break;
	            case "🍟": win = 10;
	            break;
	            case "🌟": win = 15;
	            break;
	            case "7️⃣": win = 20;
	            break;
	        }
	    }
	    
	    return win;
	}
	
	static int winThree(String result, String result2, String result3){
	    int win = 0;
	    if(result.equals(result2) && result2.equals(result3)){
	        switch(result){
	            case "🍕": win = 6;
	            break;
	            case "🍖": win = 8;
	            break;
	            case "🍉": win = 10;
	            break;
	            case "🍎": win = 14;
	            break;
	            case "🍟": win = 20;
	            break;
	            case "🌟": win = 30;
	            break;
	            case "7️⃣": win = 40;
	            break;
	        }
	    }
	    
	    return win;
	}
}