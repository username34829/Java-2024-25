import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String formattedString = String.format("Hi my name is %s,%s %s, \n%s \n\n%s %s %s", "Lucmayan"," Joshan","A","18 Yrs old", "178.M.Siosion St", "Dampalit", "Malabon");
		System.out.println(formattedString);
		
		System.out.println();
		
		for (int i = 1; i<=100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " "); }
			}
			
			System.out.println();
			System.out.println();
			
			
		for (int i = 100; i>=1; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " "); }
			}
			
	}
}