public class Pen {

    //Attributes
    static String brand = "Aurora"; // All pen is brand of aurora company
    static int numOfPen;
    String pen;
    String color;
    String nimbSize; //Fine //Extra Fine //Medium

    //Constructor
    Pen(String pen, String color, String nimbSize){
        this.pen = pen;
        this.color = color;
        this.nimbSize = nimbSize;
        numOfPen++;
    }

    //Methods
    void available(){
        System.out.println("-----------------------");
        showBrand();
        System.out.println(this.pen + " pen is available!");
        System.out.println("Color: " + this.color);
        System.out.println("Size: " + this.nimbSize);
        System.out.println("-----------------------");
    }

    static void showBrand(){
        System.out.printf("[%s]\n", brand);
    }

    static void showNumOfPen(){
        System.out.printf("We currently have %d total of Pen/s\n", numOfPen);
    }


}
