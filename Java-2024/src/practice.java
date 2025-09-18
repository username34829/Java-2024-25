import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	 boolean notAlive = true;
	 /*
	 if (notAlive)
	     System.out.println("Dead");
	 else
	     System.out.println("Still Alive");
	     
	 String letter = "abcdefghijk";
	 
	 System.out.println(letter.length());
	 
	 int x = 2, y = 2;
	 
	 boolean t = y != x;
	 
	 System.out.println(t);
	 */
	 try {
	 	
	 	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter your age >> ");
	 int age = sc.nextInt();
	 
	 System.out.println();
	 
	 if (isLegal(age)) {
	 	System.out.println("You're an adult"); }
	 	
	 else if (isOld(age)) {
	 	System.out.println("You're Senior"); }
	 	
	 else if(isTeen(age)) {
	 	System.out.println("You're teen-age"); }
	 	
	 	
	 }catch (Exception ex) {
	 	System.out.println("An error occur: re-start your program.");
	 }
	 
	 String status = age >= 18 ? grade >= 3.00 ? "summa cum laude" : "magna cum laude") : "not summa";
  
	 
	}
	
	public static boolean isLegal(int age)
	{
		if (age>=18 && age<=59) {
			return true; }
			
		
			
			return false;
	}
	
	public static boolean isOld(int age)
	{
		
		
		if (age>=60) {
			return true; }
			
			return false;
			
	}
	
	public static boolean isTeen(int age)
	{
		
		if (age<18) {
			return true; }
			
			return false;
	}
	
	
}