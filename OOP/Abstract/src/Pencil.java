public class Pencil extends WritingTool{
    //Attributes
    String name;
    int size; // What inches?
    int quantity;

    //Constructor
    Pencil(String name, int size, int quantity){
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    //Override abstract method from super or parent class
    @Override
    double price(){
        double price = 0;
        if(size >= 3 && size <= 7){
            switch (size){
                case 3, 4 -> price = 7 * quantity; //for every pencil times quantity equals price
                case 5, 6 -> price = 8 * quantity;
                case 7 -> price = 9 * quantity;
                default -> System.out.println("Something is Wrong! ");
            }
        }
        else{
            System.out.println("Can't recognize the size of pencil");
            return 0;
        }
        return price;
    }

    // .toString Override method from an Object class (super class)
    @Override
    public String toString(){
        return "---------//---------\n" +
                "Name of product: " + this.name + "\n" +
                "Size: " + this.size + " inches\n" +
                "Quantity: " + this.quantity + "\n" +
                "Price: $" + price() +"\n" +
                "---------//---------\n";
    }
}
