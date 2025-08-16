/*
    File name Act3_preFinal.java
    Written by Lucmayan, Joshan A.
    Written on Sat, 26 Oct.
                                   */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		    
		    System.out.print("Enter a number: ");
		    int num = sc.nextInt();
		
		    multiplicationTable(num);
		    
		}catch (Exception ex) {
			System.out.println("Error: Exiting...");
		}
		
		
	}
	
	public static int multiplicationTable(int x) {
		int[][] table = new int[1][10];
		
		for (int i = 0; i < 10; i++) {
			table[0][i] = x * (i + 1);
		}
		
		for (int j = 0; j < 10; j++) {
            System.out.println( x + " * " + (j + 1) + " = " + table[0][j]);
        }
		
		return x;
		
	}
}