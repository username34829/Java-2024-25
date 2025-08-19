public class Pen {

    //Attributes
    String pen = "Fountain";
    String color = "Black";
    String nimbSize = "Medium"; //Fine //Extra Fine //Medium
    int price = 2200; //Dollar
    boolean isUsing = false;

    //Constructor
    Pen(String pen, String color, String nimbSize, int price){
        this.pen = pen;
        this.color = color;
        this.nimbSize = nimbSize;
        this.price = price;
    }

    //Methods
    void use(){
        System.out.println(this.pen + " pen is currently using");
        isUsing = true;
    }


}
