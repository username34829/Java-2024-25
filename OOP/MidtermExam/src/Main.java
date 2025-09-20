import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        User borrower;
        String nameOfBorrower;
        String idOfBorrower;
        int choice;

        Lib library = new Lib("CSA Library");
        books.add(new Book("The Hobbit",  "J.R.R. Tolkien"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Introduction to Algorithms (CLRS)", "Cormen, Leiserson, Rivest, Stein"));
        books.add(new Book("Java: The Complete Reference", "Herbert Schildt"));

        library.addBooks(books);

        System.out.println("Welcome to " + library.getName());
        System.out.println("Here's the list books in library: ");
        library.display();
        System.out.print("Enter name: ");
        nameOfBorrower = scanner.nextLine();

        System.out.print("Enter ID: ");
        idOfBorrower = scanner.nextLine();

        borrower = new User(nameOfBorrower, idOfBorrower);

        System.out.print("Enter the index of book you want to borrow: ");
        choice = scanner.nextInt();

        System.out.println("-------------------------");
        System.out.println("Successfully borrowed!");
        System.out.println("-------------------------");

        //Info of borrower
        borrower.addBook(library.getBook().get(choice));
        borrower.displayInfo();
        System.out.println("-------------------------");

        System.out.println("Exit program...");

        scanner.close();

    }

}
