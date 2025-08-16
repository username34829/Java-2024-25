import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Sesrching using arrays
		
		
		String[] books = {"How to cook", "How to solve math","Discrete math"};
		Scanner scanner = new Scanner(System.in);
		String searching;
		
		System.out.print("Search: ");
		searching = scanner.nextLine();
		
		System.out.println("Searching...");
		search(books, searching);
		
		
		scanner.close();
	}
	
	static void search(String[] books, String searching){
	    
	    
	    var isFound = false;
	     
	     int lastIndex = searching.length();
	     int SecondlastIndex = searching.length() - 1;
	     
	     
	     for(int i = 0; i < books.length; i++){
	        books[i] = books[i].toLowerCase();
	        searching = searching.toLowerCase();
	        
	        int RlastIndex = books[i].length();
	        int RSecondlastIdex = books[i].length() - 1;
	        boolean analysing_FirstIndexFound = searching.substring(0, 1).equals(books[i].substring(0, 1));
	        boolean analysing_LastIndexFound = searching.substring(SecondlastIndex, lastIndex).equals(books[i].substring(RSecondlastIdex, RlastIndex));
		    
		    if(analysing_FirstIndexFound || analysing_LastIndexFound){
		        isFound = true;
		        System.out.println(books[i]);
		    }
		}
		if(!isFound){
		    System.out.println("Not Found.");
		}
	}
}