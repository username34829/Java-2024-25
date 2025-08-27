public class Paper{


    //Attributes
    String name; //Name of paper
    String size; //Long, Short
    int quantity;

    //Contractor
    Paper(String name, String size, int quantity){
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    //Get
    String getName(){
        return this.name;
    }

    String getSize(){
        return this.size;
    }

    int getQuantity(){
        return this.quantity;
    }

    //Set
    void setName(String name){
        this.name = name;
    }

    void setSize(String size){
        this.size = size;
    }

    void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
