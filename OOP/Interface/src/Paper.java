public class Paper extends WritingTool{
    //Attributes
    String name; //Name of paper
    String size; //Long, Short
    int quantity;

    //Contractor
    Paper(String name, String size, int quantity){
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    //Override abstract method from super or parent class
    @Override
    double price(){
        double price = 0;
        if(size.equalsIgnoreCase("Long")){
            price = 2.50 * quantity; //For every pack
        }
        else if(size.equalsIgnoreCase("Short")){
            price = 1.50 * quantity; //For every pack
        }
        else{
            System.out.println("Can't recognize the size!");
            return 0;
        }
        return price;
    }

    // .toString Override method from an Object class (super class)
    @Override
    public String toString(){
        return "---------//---------\n" +
                "Name of product: " + this.name + "\n" +
                "Size: " + this.size + "\n" +
                "Quantity: " + this.quantity + "\n" +
                "Price: $" + price() + "\n" +
                "---------//---------\n";
    }
}
