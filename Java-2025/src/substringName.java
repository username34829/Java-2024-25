import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		
		String[] names = name.split(" ");
		
		String formattedName_1 = names[0].substring(0, 1).toUpperCase() + 
		                         names[0].substring(1, names[0].length()).toLowerCase();
		String formattedName_2 = names[1].substring(0, 1).toUpperCase() +
		                         names[1].substring(1, names[1].length()).toLowerCase();
		                         
		String userName = formattedName_1 + " " + formattedName_2;
		
		System.out.println(userName);
		
		scanner.close();
	}
}