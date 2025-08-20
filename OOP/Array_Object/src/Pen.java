public class Pen {

    //Attributes
    String pen;
    String color;
    String nimbSize; //Fine //Extra Fine //Medium

    //Constructor
    Pen(String pen, String color, String nimbSize){
        this.pen = pen;
        this.color = color;
        this.nimbSize = nimbSize;
    }

    //Methods
    void available(){
        System.out.println(this.pen + " pen is available!");
        System.out.println("Color: " + this.color);
        System.out.println("Size: " + this.nimbSize);
    }
}
