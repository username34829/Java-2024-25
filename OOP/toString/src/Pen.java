public class Pen extends WritingTool {
    //Attributes
    String name;
    String color;
    String nimbSize; // Fine, Extra Fine, Medium

    //Constructor
    Pen(String name, String color, String nimbSize){
        this.name = name;
        this.color = color;
        this.nimbSize = nimbSize;
    }

    // .toString Override method from a Object class (super class)
    @Override
    public String toString(){
        return "---------//---------\n" +
                "Name of product: " + this.name + "\n" +
                "Color: " + this.color + "\n" +
                "Nimb Size: " + this.nimbSize + "\n" +
                "---------//---------\n";
    }
}
