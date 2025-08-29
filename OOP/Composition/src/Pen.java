public class Pen {
    //Attributes
    String name;

    //Constructor
    Pen(String name){
        this.name = name;
    }

    //Get
    String getName(){
        return this.name;
    }

    //Set
    void setName(String name){
        this.name = name;
    }

    void displayInfo(){
        System.out.println(this.name);
    }
}
