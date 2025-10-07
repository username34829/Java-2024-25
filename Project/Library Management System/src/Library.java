import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private String name;
    private List<Book> books;
    private List<Member> members;
    private Scanner scanner;
    private List<Book> borrowedBooks;
    private Bucket bucket;

    // Methods to search books, register members, etc.

    Library(String name, Scanner scanner){
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.scanner = scanner;
        this.borrowedBooks = new ArrayList<>();
        this.bucket = new Bucket();
        initializeBook();
        initializeMembers();
    }

    public void initializeBook(){
        books.add(new Book("ABC", "Lucmayan, Joshan", "123536"));
        books.add(new Book("1984", "George Orwell", "1345633"));
        books.add(new Book("Harry Potter and the Sorcerer’s Stone", "J.K. Rowling", "624353"));
        books.add(new Book("Numbers", "Lucmayan, Joshan", "4363563"));
    }

    public void initializeMembers(){
        members.add(new Member("8764276", "Franz, Kafka"));
        members.add(new Member("14379346", "Anna, Luwiss"));
        members.add(new Member("3295724", "Lei, Seiyaze"));
    }

    //Get & Set Name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //Add
    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(Member member){
        members.add(member);
    }

    //Remove
    public void removeBook(Book book){
        books.remove(book);
    }

    public void removeMember(Member member){
        members.remove(member);
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public List<Member> getMembers(){
        return this.members;
    }

    public void showRegisterMember(){
        System.out.println("Registered Member in this Library: ");
        System.out.println("     Name     |     ID     ");
        for(Member member : members){
            System.out.println(member.getName() + " -- " + member.getMemberId());
        }
    }

    public void register(){
        String name = "";
        String id = "";
        while (true) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();

            if(name.matches("[a-z-A-Z, .]+")){
                break;
            }
            else{
                System.out.println("Something went wrong! We only accept (a-z-A-Z), (,), ( ), (.)");
            }
        }

        while (true) {
            System.out.print("Enter ID: ");
            id = scanner.nextLine();

            if(id.matches("[0-9]+")){
                break;
            }
            else{
                System.out.println("Something went wrong! We only accept 0-9 (Numbers)");
            }
        }

        addMember(new Member(id, name));

        System.out.println("Successfully Registered...");
    }

    //Borrow and Return Method

    public void setBorrowedBooks(Book book){
        borrowedBooks.add(book);
        getBooks().remove(book);
    }

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public void returnBorrowedBooks(Book book){
        getBooks().add(book);
        borrowedBooks.remove(book);
    }

    public void borrow(){
        String bar;
        boolean notFound = true;

        while(true){
            try{
                System.out.print("Enter Title / ISBN: ");
                bar = scanner.nextLine();

                if(bar.matches("[a-zA-Z0-9 ,.]+")){
                    break;
                }
                else{
                    System.out.println("Invalid Enter! Please Try Again!");
                }

            }
            catch(Exception e){
                System.out.println("Something went wrong!");
            }
        }

        for(Book book : getBooks()){
            if(bar.equalsIgnoreCase(book.getTitle()) || bar.equalsIgnoreCase(book.getIsbn())){
                setBorrowedBooks(book);
                LocalDateTime dateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");

                String timeBorrowed = formatter.format(dateTime);
                bucket.setTime(timeBorrowed);

                notFound = false;
                break;
            }
        }

        if(notFound){
            System.out.println("Sorry we cant find the book");
            System.out.println("Recommend: Go to book section and check all the books there. ");
        }
        else{
            System.out.println("Successfully borrow book...");
        }
    }

    public void returnBook(){
        String rn;
        boolean notFound = true;
        while(true){
            try{
                System.out.print("Enter Title / ISBN: ");
                rn = scanner.nextLine();

                if(rn.matches("[a-zA-Z0-9 ,.]+")){
                    break;
                }
                else{
                    System.out.println("Invalid Enter! Please Try Again!");
                }

            }
            catch(Exception e){
                System.out.println("Something went wrong!");
            }
        }

        for (Book book : getBooks()){
            if(rn.equalsIgnoreCase(book.getTitle()) || rn.equalsIgnoreCase(book.getIsbn())){
                returnBorrowedBooks(book);
                notFound = false;
                break;
            }
        }

        if(notFound){
            System.out.println("Book not found!");
        }
    }


    public void viewBorrowed(){

        System.out.println("+");
        for(Book book : getBorrowedBooks()){
            System.out.println("Book you borrowed: " + book.getTitle() + " by " + book.getAuthor());
        }
        System.out.println("Time you borrowed: " + bucket.getTime());
        System.out.println("Due date: 2 weeks after borrowed");
        System.out.println("Fines if not returned in Due time: 0.10$ per hour");
        System.out.println("+");
    }
}
