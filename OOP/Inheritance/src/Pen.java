public class Pen extends WritingTool {

    String pen;
    String color;
    String nimbSize; //Fine //Extra Fine //Medium

    Pen(String pen, String color, String nimbSize){
        this.pen = pen;
        this.color = color;
        this.nimbSize = nimbSize;
    }

    void detailOfPen(){
        System.out.println("Types of Pen: " + this.pen);
        System.out.println("Color: " + this.color);
        System.out.println("Nimb Size: " + this.nimbSize);
    }

}
