import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What coffee do u want?: ");
		String cof = scanner.nextLine();
		
		if (cof.equals("choco") || cof.equals("Order #1"))
		// to be able to be true, neither condition must be TRUE. 
		{
			System.out.println("Here's Your Choco coffee, Enjoy!");
		}
	}
}		