import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double principal;
		double rate;
		double amount;
		int timesCompounded;
		int years;
		
		System.out.print("Enter principal amount: ");
		principal = scanner.nextDouble();
		
		System.out.print("Enter the interest rate (in %): ");
		rate = scanner.nextDouble() / 100.0;
		
		System.out.print("Enter the number Compounded per year: ");
	    timesCompounded = scanner.nextInt();
		
		System.out.print("Enter a number of Year: ");
		years = scanner.nextInt();
		
		amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
		
		System.out.printf("The amount after %d years is $%.2f", years, amount);
		
		scanner.close();
	}
		
		
}