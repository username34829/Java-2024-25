import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] book;
		int size;
		
		System.out.print("Enter a # books you want to add: ");
		size = scanner.nextInt();
		scanner.nextLine();
		
		book = new String[size];
		
		for(int i = 0; i < book.length; i++){
		    System.out.print("Add a book: ");
		    book[i] = scanner.nextLine();
		}
		
		System.out.println("Here's the books: ");
		for(String i : book){
		    System.out.println(i);
		}
	}


}