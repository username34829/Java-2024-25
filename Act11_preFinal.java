/*
    File name Act11_preFinal.java
    Written by Lucmayan, Joshan A.
    Written on Sat, 12 Oct.
                                   */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name - > ");
		name = sc.nextLine();
		System.out.println("");
		System.out.println("________________________________");
		System.out.println("Your name is " + formatCase(name));
		
	}
	
	public static String formatCase(String name) {
		if(name.contains(" ")) {
			String names[] = name.split(" ");
			String formattedName = "";
			
			for(String tempName : names) {
			String fl = tempName.substring(0,1).toUpperCase() + tempName.substring(1).toLowerCase();
            formattedName += fl + " "; }
			
			return formattedName; }
			
		else {
			String fl = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
			
		    return fl; }
	}
}