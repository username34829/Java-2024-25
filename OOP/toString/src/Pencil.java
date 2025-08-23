public class Pencil extends WritingTool{
    //Attributes
    String name;
    int size; // What inches?

    //Constructor
    Pencil(String name, int size){
        this.name = name;
        this.size = size;
    }

    // .toString Override method from an Object class (super class)
    @Override
    public String toString(){
        return "---------//---------\n" +
                "Name of product: " + this.name + "\n" +
                "Size: " + this.size + " inches\n" +
                "---------//---------\n";
    }
}
