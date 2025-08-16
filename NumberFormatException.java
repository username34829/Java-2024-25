import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean isValid = false;
		
		System.out.print("- ");
		String input = scanner.nextLine();
		while(!isValid){
		    
		    try{
		        int num = Integer.parseInt(input);
		        isValid = true;
		    }catch(NumberFormatException e){
		        System.out.println("Invalid");
		        System.out.print("- ");
		        input = scanner.nextLine();
		    }
		}
		
		
	}
}