// File name ActThreeMidterm.java
// Written by Lucmayan, Joshan A. from DIT First Year.
// Written on Tue, 1st Oct. 03:29 AM

/* this code demonstrate the power of try and catch 
keyword in java, where it handles the error smoothly
that might occur during program execution. */

import java.util.Scanner;
public class ActThreeMidterm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			String choice;
			int select;
			
		 try { // try block.
		 	
		 	
		  do { 
		  
		   Selection(); // calling selection method.
		   select = scInt(); // calling integer scanner method.
		  
		  //result.
		   println("-------------------------------------------");
		 
		   switch(select)
		   {
		   	case 1: println("Hi, my name is Lucmayan, Joshan A.");
		   	break;
		   	case 2: println("I lived in 178.M Siosion St. Dampalit Malabon");
		   	break;
		  	 case 3: println("I'm 18 years old.");
		   	break;
		 	  case 4: println("My hobby is Playing chess, Reading, Coding.");
		   	break;
		  	 default: println("Thank you for using this program.");
		 	  System.exit(0);
		   }
		 
		   println("-------------------------------------------");
		   
		    //asking user if he/she wants to continue.
		   	do { 
		   	
		   	  print("wnna know more about me? Y/N ");
		     	choice = scString(); // calling string scanner method.
		    	
		     	println("");
		 	 
		     	switch (choice.toLowerCase()) 
		 	    {
		  	   	case "y": println(""); // y-yes
		 	    	break;
		 	    	case "n": println("Thank you for using this program."); // n-no (exit)
		 	     System.exit(0);
		 	     default : println("Only letter \"Y\" & \"N\" Only. Please enter again.");
		 	     break; //if the user not entering y/n. (loop)
		 	    }
		 	   
		 	   
		    	}while(!choice.equalsIgnoreCase("y")); //loop as long as not "y" String
		  	 
		  	 
		  } while(true); //loop
			
			 
			
		 // catch block.
		 }catch(Exception ex) { 
		 	println("Can't recognize the input. Please re-start the program.");
	 	}
			
	}
	
	public static void println(String z) // println method.
	{
		System.out.println(z);
	}
	
	
	public static void print(String x) // print method.
	{
		System.out.print(x);
	}
	
	
	public static void Selection() { // selection method.
		println(" -------------------- ");
		println("|Enter my information|" + 
		        "\n|1.Name              |" + 
		        "\n|2.Address           |" + 
		        "\n|3.Age               |" + 
		        "\n|4.Hobbies           |" + 
		        "\n|5.Exit              |");
 	println(" -------------------- ");
	}
	
	
	public static int scInt() // integer scanner method.
	{
		Scanner sc = new Scanner(System.in);
	 int a;
	 print(">>");
		a = sc.nextInt();
		return a;
	}
	
	
	public static String scString() // string scanner method.
	{
		Scanner sc = new Scanner(System.in);
	 String b;
		b = sc.nextLine();
		return b;
	}


}