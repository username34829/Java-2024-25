import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random dice = new Random();
		
		
		for (int i = 1; i < 10; i++) {
		    int numberDice = 1+dice.nextInt(6);
		    System.out.println("Your Random number is: " + numberDice);
		}
	}
}