public class Pen {
    //Attributes
    String name;
    String color;
    String nimbSize; // Fine, Extra Fine, Medium
    int quantity;

    //Constructor
    Pen(String name, String color, String nimbSize, int quantity){
        this.name = name;
        this.color = color;
        this.nimbSize = nimbSize;
        this.quantity = quantity;
    }

    //Get
    String getName(){
        return this.name;
    }

    String getColor(){
        return this.color;
    }

    String getNimbSize(){
        return this.nimbSize;
    }

    int getQuantity(){
        return this.quantity;
    }

    //Set
    void setName(String name){
        this.name = name;
    }

    void setColor(String color){
        this.color = color;
    }

    void setNimbSize(String nimbSize){
        this.nimbSize = nimbSize;
    }

    void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
