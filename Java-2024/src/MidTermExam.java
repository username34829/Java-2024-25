// File name MidTermExam.java
// Written by Lucmayan, Joshan A. DIT First Year
// Written on Sat, 5th Oct. 01:00 PM

/*

MIDTERM EXAM

1. Use switch cases to the following:

-> 1. Enter name

-> 2. Enter age

-> 3. Enter address

-> 4. Display Information

-> 5. Exit

2. Use if / else to enter a age:
> Validate if the age is legal or not
 
3. Entering of name should be Camel Case Format

4. Address should have lot number, street, city and zip code

5. Display all the items from 1 - 4 */

import java.util.Scanner;
public class MidTermExam {
	public static void main(String[] args) {
		
		int enter;
		int age = 0;
		int zipcode = 0;
		String name = "";
		String lotNumberStreet = "";
		String address = "";
		String city = "";
		boolean valid = false;
		
		
		
	try {		
		do {
			
			
			
						
			menu(); // calling menu method.
			print("-");
			enter = scInt(); // Scanner Integer method (scInt)

			// result.
			switch(enter) {
				case 1:
				       do {
				        print("Enter name - > ");
		                name = scString();
				        
				        if (camelCase(name)) {
				        	valid = true;
				        }
				        else { 
				        	println("Please Enter your name in Camel Case, e.g. John Doe");
				        }
				       }while(!camelCase(name));
				break;
				case 2: 
				        print("Enter age - > ");
		            	age = scInt();
				break;
				case 3: 
				        println("Enter:"); 
				        print("Lot Number & Street - > ");
				        lotNumberStreet = scString();
				        print("City - > ");
				        city = scString();
				        print("Zip code - > ");
				        zipcode = scInt();
				break;
				case 4: 
				    println("Your name is " + name);
				    
				    if(age>=18) {
					println("Your age is " + age + ", You're legal age.");
			   	}
			   	
				    else if (age<=17) {
				    println("Your age is " + age + ", You're not legal age.");
				   }
				   
				    println("Your address is "+ lotNumberStreet + " " + city + " " + zipcode);
				   
				break;
				case 5: println("Thank you for using this program.");
				System.exit(0);
				
			}
			
			
			
			
		}while(true);
	}catch (Exception ex) {
		println("Error: Exiting... ");
	}
	
		
		
	}
	
	//println method.
	public static void println(String s) {
		System.out.println(s);
	}
	
	// print method.
	public static void print(String a) {
		System.out.print(a);
	}
	
	// Scanner Integer method.
	public static int scInt() {
		Scanner sc = new Scanner(System.in);
		int z;
		z = sc.nextInt();
		return z;
	}
	
	// Scanner String method.
	public static String scString(){
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.nextLine();
		return x;
	}
	
	//menu method.
	public static void menu() {
		println("____________________________");
		println("Select: " + 
		      "\n - > 1. Enter Name" + 
		      "\n - > 2. Enter Age" + 
		      "\n - > 3. Enter Address" + 
		      "\n - > 4. Display Information" + 
		      "\n - > 5. Exit");
	    println("____________________________");
	}
	
	//checking the name if Camel Cases or not.
	private static boolean camelCase(String name) {
    String[] n = name.split(" ");
    
    for (String i : n) {
        if (!Character.isUpperCase(i.charAt(0))) {
            return false;
        }
    for (int m = 1; m < i.length(); m++) {
        if (!Character.isLowerCase(i.charAt(m))) {
            return false;
                }
            }
        } return true;
    }

}