public class Pen extends WritingTool {
    //Attributes
    String name;
    String color;
    String nimbSize; // Fine, Extra Fine, Medium
    int quantity;

    //Constructor
    Pen(String name, String color, String nimbSize, int quantity){
        this.name = name;
        this.color = color;
        this.nimbSize = nimbSize;
        this.quantity = quantity;
    }

    @Override
    void name(){
        System.out.println(this.name);
    }

    //Override abstract method from super or parent class
    @Override
    double price(){
        double price = 0;
        if(nimbSize.isEmpty()){
            System.out.println("Can't recognize the size of nimb");
            return 0;
        }
        else if(nimbSize.equalsIgnoreCase("Fine") || nimbSize.equalsIgnoreCase("Medium")){
            price = 99 * quantity;
        }
        else if(nimbSize.equalsIgnoreCase("Extra Fine")){
            price = 120 * quantity;
        }
        else{
            System.out.println("Can't recognize the size of nimb");
            return 0;
        }
        return price;
    }

    // .toString Override method from an Object class (super class)
    @Override
    public String toString(){
        return "---------//---------\n" +
                "Name of product: " + this.name + "\n" +
                "Color: " + this.color + "\n" +
                "Nimb Size: " + this.nimbSize + "\n" +
                "Quantity: " + this.quantity + "\n" +
                "Price: $" + price() + "\n" +
                "---------//---------\n";
    }
}
