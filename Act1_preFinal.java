/*
    File name Act1_preFinal.java
    Written by Lucmayan, Joshan A.
    Written on Sat, 19 Oct.
                                   */

public class Main {
	public static void main(String[] args) {
		System.out.println("Odd");
		for (int i = 1; i <= 10;i++){
			if (i % 2 == 1)
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Even");
		for (int i = 1; i <= 10;i++){
			if (i == 1)
			System.out.println(i);
			else if (i % 2 == 0)
			System.out.println(i);
		}
	}
}