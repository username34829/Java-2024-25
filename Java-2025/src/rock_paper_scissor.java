import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String[] selections = new String[] {"Rock","Paper","Scissor"};
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String playerGuess = "";
		boolean isValid = false;
		
		
		System.out.print("Enter (Rock, Paper, Scissor): ");
		playerGuess = scanner.nextLine();
		
		String formattedPlayerGuess = playerGuess.substring(0, 1).toUpperCase() + playerGuess.substring(1, playerGuess.length()).toLowerCase();
		playerGuess = formattedPlayerGuess;
		
		for(int i = 0; i < selections.length; i++){
		    if(playerGuess.equals(selections[i])){
		        isValid = true;
		        break;
		    }
		}
		if(!isValid){
		    System.out.println("- Invalid Enter! -");
		    System.exit(0);
		}
		
		
		String computerGuess = computerGuess(selections, random);
		
		System.out.println("----------------------");
		System.out.println("Player Guess: " + playerGuess);
		System.out.println("Computer Guess: " + computerGuess);
		
		
		System.out.println("----------------------");
		if(isTied(playerGuess, computerGuess)){
		    System.out.println("Tied");
		}
		else if(isPlayerWinner(playerGuess, computerGuess)){
		    System.out.println("Player wins");
		}
		else{
		    System.out.println("Computer wins");
		}
		System.out.println("----------------------");
		
		
		scanner.close();
	}
	public static String computerGuess(String[] selections, Random random){
	    String computerGuess = selections[random.nextInt(3)];
	    return computerGuess;
	}
	
	
	public static boolean isTied(String playerGuess, String computerGuess){
	    if(playerGuess.equals(computerGuess)){
	        return true;
	    }
	    return false;
	}
	
	
	public static boolean isPlayerWinner(String playerGuess, String computerGuess){
	    if(playerGuess.equals("Rock") && computerGuess.equals("Scissor") ||
	       playerGuess.equals("Paper") && computerGuess.equals("Rock") ||
	       playerGuess.equals("Scissor") && computerGuess.equals("Paper")){
	           return true;
	       }
	    return false;
	}
}