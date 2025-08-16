import java.util.Random;
import java.util.Scanner;
public class Random2 {
	public static void main(String[] args) {
	    // We can improve this code but, im only  using phone
	    // and other method of random cannot be access

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int guess;
		int attempt = 0;
		int randomNumber;
		int min = 1;
		int max = 100;

		System.out.println("Welcome to the guessing game.");
		System.out.println("Select between 1-100");
		System.out.println("-----------------------------");

		randomNumber = random.nextInt(max + 1);

		do {
			System.out.print("Enter number: ");
			guess = scanner.nextInt();
			attempt++;

			if (guess > randomNumber) {
				System.out.println("- Too High!!");
			} else if (guess < randomNumber) {
				System.out.println("- Too low!!");
			} else {
				System.out.println("- Correct! You guess it.");
			}

		} while (guess != randomNumber);

		System.out.println();
		System.out.println("You won!!");
		System.out.println("Number of attempt: " + attempt);

	}
}