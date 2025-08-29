public class Pencil {
    //Attributes
    private String name;

    //Constructor
    Pencil(String name){
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
