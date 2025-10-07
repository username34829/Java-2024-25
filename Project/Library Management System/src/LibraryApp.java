import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryApp {
    //Task: Track due dates and fines

    public static void main(String[] args) {
        start();
    }

    static Scanner scanner = new Scanner(System.in);
    static Library library = new Library("CSA Library", new Scanner(System.in));

    public static void start(){
        int token = 0;
        do{
            System.out.println("- Welcome to " + library.getName() + " Management System -");
            if(token == 0){
                System.out.println("[System] To navigate the app select option below");
                token = 1;
            }
            System.out.println("1. Books");
            System.out.println("2. Member");
            System.out.println("3. Borrow/Return");
            System.out.println("4. Exit");
            try{
                System.out.print("- ");
                String choice = scanner.nextLine();
                int numChoice = Integer.parseInt(choice);
                switch (numChoice){
                    case 1 -> bookSection();
                    case 2 -> memberSection();
                    case 3 -> borrowReturn();
                    case 4 -> {
                        System.out.println("Exiting...");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice! Try Again.");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid choice! Try Again.");

            }
            catch(NumberFormatException e){
                System.out.println("Please choice an option! Try Again.");
            }
        }while(true);


    }

    public static void bookSection(){
        int numChoice = 0;
        while(numChoice != 5){
            try {

                System.out.println("[Book Section]");
                System.out.println("1. Add");
                System.out.println("2. Remove");
                System.out.println("3. Search");
                System.out.println("4. View All Books");
                System.out.println("5. Back");
                System.out.print("- ");
                String choice = scanner.nextLine();
                numChoice = Integer.parseInt(choice);
                switch (numChoice){
                    case 1 -> addBook();
                    case 2 -> removeBook();
                    case 3 -> searchBooks();
                    case 4 -> viewAllBooks();
                    case 5 -> System.out.println("...");
                    default -> System.out.println("Invalid Choice! Try Again.");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid choice! Try Again.");

            }
            catch(NumberFormatException e){
                System.out.println("Please choice an option! Try Again.");
            }
        }
    }

    public static void addBook(){
        String name;
        String author;
        String isbn;

        while(true){
            System.out.print("Enter Title: ");
            name = scanner.nextLine();

            if(name.matches("[a-z-A-Z ,.]+")){
                break;
            }
            else{
                System.out.println("Something went wrong! " +
                        "We accept Title that contains: a-z A-Z, ( ), (.), (,)");
            }
        }

        while(true){
            System.out.print("Enter Author: ");
            author = scanner.nextLine();

            if(author.matches("[a-z-A-Z ,.]+")){
                break;
            }
            else{
                System.out.println("Something went wrong! " +
                        "Author name should contains: a-z A-Z, ( ), (.), (,)");
            }
        }

        while(true){
            System.out.print("Enter ISBN: ");
            isbn = scanner.nextLine();

            if(isbn.matches("[0-9]+")){
                break;
            }
            else{
                System.out.println("Something went wrong! ISBN should contains: 0-9");
            }
        }


        library.addBook(new Book(name, author, isbn));

        System.out.println("Successfully added the book...");
    }

    public static void removeBook(){
        String isbn;

        while(true){
            System.out.print("Enter ISBN of the book you want to delete: ");
            isbn = scanner.nextLine();

            if(isbn.matches("[0-9]+")){
                break;
            }
            else{
                System.out.println("Something went wrong! ISBN should contains: 0-9");
            }
        }

        for(int i = 0; i < library.getBooks().size(); i++){
            if(isbn.equalsIgnoreCase(library.getBooks().get(i).getIsbn())){
                library.removeBook(library.getBooks().get(i));
                break;
            }
        }

        System.out.println("Successfully removed the book...");
    }

    public static void searchBooks(){

        boolean notFound = true;
        boolean key = true;

        String searForBook;
        while(true){
            System.out.print("Enter the title or author of book: ");
            searForBook = scanner.nextLine().trim();

            if(searForBook.matches("[a-z-A-Z-0-9 ,.']+")){
                break;
            }
            else{
                System.out.println("Something went wrong! " +
                        "search should contains Title and names of Author.");
            }
        }

        System.out.println("Search for: " + searForBook);

        System.out.println(); //Space
        System.out.println("-     Result     - ");
        System.out.println(); //Space

        if(searForBook.contains(" ")){
            String[] cuts = searForBook.split(" ");

            for(String cut : cuts){
                for(Book book : library.getBooks()){
                    if(cut.trim().substring(0, 2).equalsIgnoreCase(book.getTitle().substring(0, 2)) ||
                            cut.trim().substring(0, 2).equalsIgnoreCase(book.getAuthor().substring(0, 2))){
                        if(key){
                            System.out.println("Here's the book: ");
                            key = false;
                        }
                        System.out.println(" * " + book.getTitle() + " by " + book.getAuthor());
                        notFound = false;
                    }
                }
            }
        }
        else{
            for(Book book : library.getBooks()){

                String[] title = book.getTitle().split(" ");
                String[] author = book.getAuthor().split(" ");

                //Checker for author
                for(String f : author){
                    if(f.trim().substring(0, 2).equalsIgnoreCase(searForBook.substring(0, 2))){
                        if(key){
                            System.out.println("You mean " + book.getAuthor() + "?");
                            System.out.println("Here's the Book of the author:");
                            key = false;
                        }
                        System.out.println(" * " + book.getTitle() + " by " + book.getAuthor());
                        notFound = false;
                    }
                }

                //Checker for title
                for(String s : title){
                    if(s.trim().substring(0, 2).equalsIgnoreCase(searForBook.substring(0, 2))){
                        if(key){
                            System.out.println("Here's the book: ");
                        }
                        System.out.println(" * " + book.getTitle() + " by " + book.getAuthor());
                        notFound = false;
                    }
                }
            }
        }

        if(notFound){
            System.out.println("Sorry, no found book");
            System.out.println("Recommend: Check all the Available Books in \"View All Books\" Option");
        }

        System.out.println(); //Space
    }

    public static void viewAllBooks(){
        System.out.println("[All Books in " + library.getName() + "]");
        for(Book book : library.getBooks()){
            System.out.println(" * " +book.getTitle() + " by " + book.getAuthor());
        }
    }


    public static void memberSection(){
        String input;
        int choice = 0;

        while(choice!=5){
            try{
                System.out.println("[Member Section]");
                System.out.println("1. Register");
                System.out.println("2. Removed");
                System.out.println("3. Search");
                System.out.println("4. View All Members");
                System.out.println("5. Back");
                System.out.print("- ");
                input = scanner.nextLine();
                choice = Integer.parseInt(input);
            }
            catch (Exception e){
                System.out.println("Something went wrong! Please Try Again!");
            }

            switch (choice){
                case 1 -> registerMember();
                case 2 -> removedMembers();
                case 3 -> searchMembers();
                case 4 -> viewAllMembers();
                case 5 -> System.out.println("...");
                default -> System.out.println("Invalid choices! Choose between 1-5");
            }
        }
    }

    public static  void registerMember(){
        library.register();
    }

    public static void removedMembers(){
        String rm;
        boolean notFound = true;

        System.out.print("Enter ID or Name of the Member you want to delete: ");
        rm = scanner.nextLine();

        for(Member member : library.getMembers()){
            if(rm.equalsIgnoreCase(member.getName()) || rm.equalsIgnoreCase(member.getMemberId())){
                library.removeMember(member);
                System.out.println("Successfully removed member...");
                notFound = false;
                break;
            }
        }

        if(notFound){
            System.out.println("Members not Found");
        }

    }

    public static void searchMembers(){
        boolean notFound = true;
        boolean key = true;

        String searForMember;
        while(true){
            System.out.print("Enter the ID or Name of the Member you want to delete: ");
            searForMember = scanner.nextLine().trim();

            if(searForMember.matches("[a-z-A-Z-0-9 ,.']+")){
                break;
            }
            else{
                System.out.println("Something went wrong! " +
                        "search should contains ID or Name of Member.");
            }
        }

        System.out.println("Search for: " + searForMember);

        System.out.println(); //Space
        System.out.println("-     Result     - ");
        System.out.println(); //Space

        if(searForMember.contains(" ")){
            String[] cuts = searForMember.split(" ");

            for(String cut : cuts){
                for(Member member: library.getMembers()){
                    if(cut.trim().substring(0, 2).equalsIgnoreCase(member.getMemberId().substring(0, 2)) ||
                            cut.trim().substring(0, 2).equalsIgnoreCase(member.getName().substring(0, 2))){
                        System.out.println(" * " + member.getName());
                        notFound = false;
                    }
                }
            }
        }
        else{
            for(Member member : library.getMembers()){

                String[] name = member.getName().split(" ");

                //Checker for author
                for(String f : name){
                    if(f.trim().substring(0, 2).equalsIgnoreCase(searForMember.substring(0, 2))){
                        if(key){
                            System.out.println("You mean " + member.getName() + "?");
                            key = false;
                        }
                        System.out.println(" * " + member.getName());
                        notFound = false;
                    }
                }

                if(member.getMemberId().substring(0, 2).equalsIgnoreCase(searForMember.substring(0, 2))){
                    System.out.println(" * " + member.getName());
                    notFound = false;
                }


            }
        }

        if(notFound){
            System.out.println("Sorry, no found Member");
            System.out.println("Recommend: Check all the Members in \"View All Members\" Option");
        }

        System.out.println(); //Space
    }

    public static void viewAllMembers(){
        library.showRegisterMember();
    }

    public static void borrowReturn(){
        String input;
        int choice = 0;

        while(choice != 4){
            try{
                System.out.println("[Borrow/Return Section]");
                System.out.println("1. Borrow Book");
                System.out.println("2. Return Book");
                System.out.println("3. View What you borrowed | Due dates | Fines");
                System.out.println("4. Back");
                System.out.print("- ");
                input = scanner.nextLine();
                choice = Integer.parseInt(input);

                switch (choice){
                    case 1 -> library.borrow();
                    case 2 -> library.returnBook();
                    case 3 -> library.viewBorrowed();
                    case 4 -> System.out.println("...");
                    default -> System.out.println("Invalid Choice, Please Try Again!");
                }
            }
            catch(Exception e){
                System.out.println("Something went wrong! Please Try Again!");
            }

        }

    }
}
