import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press Q quit the game");
		String quit = scanner.next();
		System.out.println("Press q quit the game");
		String quit1 = scanner.next();
		
		if (!quit.equals("Q") && !quit1.equals("q"))
		// reverses boolean value of condtion.
		{
			System.out.println("You Quit the game");
		}
		else 
		{
			System.out.println("Your not Quiting, Please re-Enter \"Q or q\" or kindly return to play");
		} 
	}
}