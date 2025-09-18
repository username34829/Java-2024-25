import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Overload Method
		Scanner scanner = new Scanner(System.in);
		
		menu();
		String added = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("We succesfully added!");
		System.out.println("Here is the review: ");
		System.out.println("You want to add; " + add(added));
		
		
	}
	static void menu(){
	    System.out.println("Type What sauce you want to add:");
	    System.out.println("hotchilly, soysauce, sweetsauce, vinigarsauce");
	    System.out.println("Note: Use \" , \" to seperate");
	    System.out.print("- > ");
	    
	}
	static String add(String sauce){
	    return sauce;
	}
	static String add(String sauce, String sauce2){
	    return sauce + " " + sauce2;
	}
	static String add(String sauce, String sauce2, String sauce3){
	    return sauce + " " + sauce2 + " " + sauce3;
	}
	static String add(String sauce, String sauce2, String sauce3, String sauce4){
	    return sauce + " " + sauce2 + " " + sauce3 + " " + sauce4;
	}
}