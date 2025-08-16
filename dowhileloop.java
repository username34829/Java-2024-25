import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			print("Enter between 1 and 10: ");
			num = sc.nextInt();
		}while(num<1 || num>10);
		
		if (num>=1 && num<=10) {
			println("This is between 1 and 10. Thanks!");
		} 
		
		
	
	}
		
		public static void println(String x) {
			
			System.out.println(x);
			
		}
			
		public static void print(String y) {
			
			System.out.print(y);


	}
}