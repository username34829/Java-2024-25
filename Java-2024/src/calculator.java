import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fnum, snum;
		int multi, sub, div, add, rem;
		double ave;
		
		
		print("Enter First number >> ");
		fnum = sc.nextInt();
		
		print("Enter Second number >> ");
		snum = sc.nextInt();
		
		multi = fnum * snum;
		sub = fnum - snum;
		div = fnum / snum;
		add = fnum + snum;
		ave = (double) add / 2;
		rem = fnum % snum; // Remainder
		
		println(fnum + " * " + snum +" Result: " + multi);
		println(fnum + " - " + snum + " Result: " + sub);
		println(fnum + " / " + snum +" Result: " + div);
		println(fnum + " + " + snum + " Result: " + add);
		println(fnum + " m " + snum + " Result: " + ave);
		println(fnum + " % " + snum + " Result: " + rem);
		
		
		
		
	}
	public static void println(String s) {
		System.out.println(s); }
		
	public static void print(String s) {
		System.out.print(s); }
}