public class Pen extends WritingTool {

    String pen;
    String color;
    String nimbSize; //Fine //Extra Fine //Medium

    Pen(String pen, String color, String nimbSize, String description){
        super(pen, description); //Passing an argument to parent class or super lass (WritingTool class)
        this.color = color;
        this.nimbSize = nimbSize;
    }

    void detailOfPen(){
        System.out.println("Types of Pen: " + this.pen);
        System.out.println("Color: " + this.color);
        System.out.println("Nimb Size: " + this.nimbSize);
    }

}
