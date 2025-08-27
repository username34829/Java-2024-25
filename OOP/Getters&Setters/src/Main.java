public class Main {
    public static void main(String[] args){
        Pencil pencil = new Pencil("Charcoal pencil", 7, 2);

        pencil.setName("Color pencil"); //set is the one that write
        System.out.println(pencil.getName()); //get is the one that read
        System.out.println(pencil);
    }
}