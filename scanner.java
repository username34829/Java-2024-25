import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Whats your name?: ");
		String name = scanner.nextLine();
		System.out.println("How old are?: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What do u like?: ");
		String like = scanner.nextLine();
		
		
		System.out.println("\nYour name is: "+name);
		System.out.println("Your age is: "+age);
		System.out.println("You like: "+like);
		
	}
}