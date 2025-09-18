import java.util.Scanner;

public class decision_making {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your age?: ");
		int age = scanner.nextInt();

		if(age>18 && age<100)
		
		{
			System.out.println("You're an adult!");
		} 
		
		else if (age>=100)
		{
			System.out.println("You're too old!");
		}
		else
		{
			System.out.println("You're not an adult!");
		}
		
		System.out.println("What is your name?: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		
		System.out.println("Hi "+name);
		

	}
}