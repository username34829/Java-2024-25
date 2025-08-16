import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str;
		boolean isEmpt = false;
		
		
		while(true){
		    System.out.print("Enter String: ");
		    str = scanner.nextLine();
		    
		    isEmpt = str.isEmpty();
		    
		    if(isEmpt){
		        System.out.println("---------------");
		        System.out.println("String is Empty!");
		        System.out.println("---------------");
		    }
		    else{
		        System.out.println("-------------------");
		        System.out.println("There is a String!");
		        System.out.println("String is: " + str);
		        System.out.println("-------------------");
		        break;
		    }
		    
		    
		}
	}
}