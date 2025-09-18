import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Variable arguments
		// ... (ellipsis)
		Scanner scanner = new Scanner(System.in);
		
		added("A", "B", "C");
		
	}
	static void added(String... letters){
	    
	    for(String i : letters){
	        System.out.print(i + " ");
	    }
	    
	}
}