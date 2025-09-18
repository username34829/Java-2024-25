public class Main {
    public static void main(String[] args){
        WritingTool<String, Double> product1 = new WritingTool<>("Pen", 2.2);
        WritingTool<String, Integer> product2 = new WritingTool<>("Pencil", 3);
        WritingTool<String, String> product3 = new WritingTool<>("Paper", "Not Available!");

        System.out.println("Product: " + product1.getTool());
        System.out.println("Price: " + product1.getPrice());

        System.out.println();
        System.out.println("Product: " + product2.getTool());
        System.out.println("Price: " + product2.getPrice());

        if(product3.getPrice().equals("Not Available!")){
            System.out.println();
            System.out.println("[The " + product3.getTool() + " is Not Available at the moment!]");

        }
        else{
            System.out.println();
            System.out.println("Product: " + product3.getTool());
            System.out.println("Price: " + product3.getPrice());
        }
    }
}