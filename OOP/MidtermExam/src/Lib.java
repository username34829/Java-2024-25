import java.util.ArrayList;
import java.util.List;

public class Lib {
    private String name; //name of library
    private List<Book> books;

    Lib(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addBooks(List books){
        this.books = books;
    }


    public List<Book> getBook(){
        return this.books;
    }

    public void display(){
        for(int i = 0; i < books.size(); i++){
            System.out.println(i + ". Title: " + books.get(i).getTitle() + " | Author: " + books.get(i).getAuthor());
        }
    }

}
