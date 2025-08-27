public class Pencil implements DrawingTool {
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

    @Override
    public void draw() {
        System.out.println("Start drawing...");
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

    @Override
    public String toString(){
        return name + " | " + size + " | " + quantity;
    }

}
