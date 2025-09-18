import java.util.Scanner;
import java.lang.Thread;

class Storage {
	
	int number = 0;
	
	
}
public class Counter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Storage store = new Storage();
		try {
		soutln("Hi, i'm a program who can count.");
		soutln("Enter Number from 1-100 and i'll read it.");
		sout("- >");
		store.number = sc.nextInt();
		
		for (int i = store.number; i <= 100; i++) {
			sout(i + " ");
			try {
			Thread.sleep(90);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			for (int x = 100; i == x; x++) {
				sout("Done...");
			}
		}
		} catch (Exception ex) {
			soutln("Error: Exiting...");
		}
		
	}
	public static void sout(String a) {
		System.out.print(a);
	}
	public static void soutln(String a) {
		System.out.println(a);
	}
}