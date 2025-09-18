import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int a = 2 << 8; // 10 bits (in numerical '2') added 8 zero
		                //         10 + 00000000 
		                //         = 1000000000 bits
		                //         = 512 in numerical
		                // so the result is = 512
		
		System.out.println(a);
		
	}
	
}