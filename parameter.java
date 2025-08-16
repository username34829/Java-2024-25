import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fnum, snum;
		
		println("Divided Caluclator");
		println("--------------------------");
		print("Enter First number >> ");
		fnum = sc.nextInt();
		print("Enter Second number >> ");
		snum = sc.nextInt();
		
		println("");
		
		DividedNumbers(fnum, snum);
		
	}
	public static void DividedNumbers(int a, int b)
 {
 	int result;
 	result = a / b;
 	System.out.println(a + " Divided by " + b + " is equal to " + result);
 }
 public static void println(String s)
 {
 	System.out.println(s);
 }
 public static void print(String s)
 {
 	System.out.print(s);
 }
}