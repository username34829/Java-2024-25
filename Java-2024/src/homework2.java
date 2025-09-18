// LUCMAYAN, JOSHAN A. DIT Y.R-1
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
	
		
		do // Start
		{
			System.out.print("Select operation." + 
			                "\n--------------------" + 
		                 "\n|1. Addition       |" + 
		                 "\n|2. Division       |" + 
		                 "\n|3. Multiplication |" + 
		                 "\n|4. Subtraction    |" + 
		                 "\n|5. Exit           |" + 
		                 "\n--------------------" + 
		                 "\nEnter here: ");
		 op = sc.nextInt();
		 
		 if (op==5) // End
		 {
		 	System.out.println("-------------------------------");
		 	System.out.println("Thank u for using this program.");
		 	break;
		 }
		 if (op>5) // Return
		 {
		 	System.out.println("-------------------------------------");
		 	System.out.println("Pls Enter between 1-5 only, thank u.");
		 	System.out.println("-------------------------------------");
		 	continue;
		 }
		 
		 // Continue
		 
		 System.out.print("First Num: ");
		 double fnum = sc.nextDouble();
		 
		 System.out.print("Second Num: ");
		 double snum = sc.nextDouble();
		
			switch(op) // Result
			{
				case 1: System.out.println(fnum + " Added by " + snum + " is " + (fnum + snum));
				break; 
				case 2: System.out.println(fnum + " Divided by " + snum + " is " + (fnum / snum));
				break;
				case 3: System.out.println(fnum + " Multiply by " + snum + " is " + (fnum * snum));
				break;
				case 4: System.out.println(fnum + " Decreased by " + snum + " is " + (fnum - snum));
			}
				System.out.println("--------------------");
		} while (true); // Loop
	
	}
}