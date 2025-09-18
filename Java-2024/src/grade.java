import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Grade: ");
		float g = sc.nextFloat();
		
		if (g == 1.00)
		{
			System.out.println("Summa");
		}
		else if (g == 1.25)
		{
			System.out.println("Magna");
		}
		else if (g == 1.50)
		{
			System.out.println("Laude");
		}
		else if (g == 3.00)
		{
			System.out.println("Passed");
		}
		else if (g > 3.00)
		{
			System.out.println("Failed");
		}
	
		
	}
}