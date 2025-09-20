import java.util.ArrayList;
import java.util.List;

public class User {
    private String borrower;
    private String id;
    private List<Book> books;

    User(String borrower, String id){
        this.borrower = borrower;
        this.id = id;
        this.books = new ArrayList<>();
    }

    //Get

    public List<Book> getBooks() {
        return books;
    }

    public String getId() {
        return id;
    }

    public String getBorrower() {
        return borrower;
    }

    //Get

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void displayInfo(){
        System.out.println("Name: " + borrower);
        System.out.println("ID: " + id);

        for(Book book : books){
            System.out.println("Book borrowed: " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
