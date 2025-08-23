public class Paper extends WritingTool{
    //Attributes
    String name; //Name of paper
    String size; //Long, Short

    //Contractor
    Paper(String name, String size){
        this.name = name;
        this.size = size;
    }

    // .toString Override method from a Object class (super class)
    @Override
    public String toString(){
        return "---------//---------\n" +
                "Name of product: " + this.name + "\n" +
                "Size: " + this.size + "\n" +
                "---------//---------\n";
    }
}
