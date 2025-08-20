public class Pen {

    //Attributes
    String pen;
    String color;
    String nimbSize; //Fine //Extra Fine //Medium
    double price = 2200; //Dollar

    //Overloaded Constructor
    Pen(){
        this.pen = "Not Found";
        this.color = "Not Found";
        this.nimbSize = "Not Found";
        this.price = 0;
    }

    Pen(String pen){
        this.pen = pen;
        this.color = "Not Found";
        this.nimbSize = "Not Found";
        this.price = 0;
    }

    Pen(String pen, String color){
        this.pen = pen;
        this.color = color;
        this.nimbSize = "Not Found";
        this.price = 0;
    }

    Pen(String pen, String color, String nimbSize){
        this.pen = pen;
        this.color = color;
        this.nimbSize = nimbSize;
        this.price = 0;
    }

    Pen(String pen, String color, String nimbSize, double price){
        this.pen = pen;
        this.color = color;
        this.nimbSize = nimbSize;
        this.price = price;
    }
}
