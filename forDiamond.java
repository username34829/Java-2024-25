import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//first line
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j < 8; j++) {
				System.out.print(" ");
			}
			
			for (int a = 1; a <= 1; a++) {
				System.out.println("*");
			}
		}
		
		//spacing line
		for (int v = 1; v <= 3; v++) {
			System.out.println(" ");
		}
		
		
		//second line
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			for (int a = 1; a <= 13; a++) {
				System.out.print(" ");
			}
			
			for (int c = 1; c <= i; c++) {
				System.out.println("*");
			}
		}
		
		
		//spacing line
		for (int v = 1; v <= 3; v++) {
			System.out.println(" ");
		}
		
		
		//tird line
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j < 8; j++) {
				System.out.print(" ");
			}
			
			for (int a = 1; a <= 1; a++) {
				System.out.println("*");
			}
		}
		
		
		
		
		
	}
}