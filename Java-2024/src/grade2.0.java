import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your grade: ");
		double grade = sc.nextDouble();
		
		System.out.println();
		
		
		String status = (grade >= 1.00 && grade < 1.25) ? "Summa" :
		                (grade >= 1.25 && grade < 1.50) ? "Magna" :
		                (grade >= 1.50 && grade < 3.00) ? "Laude" : 
		                (grade == 3.00) ? "Passed" : "Failed";
		
		System.out.println(status);
	}
}