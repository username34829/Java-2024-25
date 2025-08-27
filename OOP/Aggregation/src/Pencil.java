import org.w3c.dom.ls.LSOutput;

public class Pencil {
    //Attributes
    private String name;
    private int size; // What inches?
    private int quantity;

    //Constructor
    Pencil(String name, int size, int quantity){
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    //Get
    String getName(){
        return this.name;
    }

    int getSize(){
        return this.size;
    }

    int getQuantity(){
        return this.quantity;
    }


    //Set
    void setName(String name){
        this.name = name;
    }

    void setSize(int size){
        this.size = size;
    }

    void setQuantity(int quantity){
        this.quantity = quantity;
    }

    void displayInfo(){
        System.out.println("-*-*-*-*-*-*-*-");
        System.out.println("Name: " + this.name);
        System.out.println("Size: " + this.size + " inches");
        System.out.println("Quantity: " + this.quantity);
    }

}
