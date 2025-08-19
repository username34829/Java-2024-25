public class Main {
    public static void main(String[] args) {

        Pen pen1 = new Pen("Fountain", "Black", "Fine", 100);
        Pen pen2 = new Pen("Ball", "Black", "Medium", 20);
        Pen pen3 = new Pen("Gel", "Red", "Extra fine", 50);

        System.out.println(pen1.pen);
        System.out.println(pen1.color);
        System.out.println(pen1.nimbSize);
        System.out.println(pen1.price);
        System.out.println(pen1.isUsing);
        pen1.use();
        System.out.println(pen1.isUsing);

        System.out.println(); //newLine

        System.out.println(pen2.pen);
        System.out.println(pen2.color);
        System.out.println(pen2.nimbSize);
        System.out.println(pen2.price);
        System.out.println(pen2.isUsing);
        pen2.use();
        System.out.println(pen2.isUsing);

        System.out.println(); //newLine

        System.out.println(pen3.pen);
        System.out.println(pen3.color);
        System.out.println(pen3.nimbSize);
        System.out.println(pen3.price);
        System.out.println(pen3.isUsing);
        pen3.use();
        System.out.println(pen3.isUsing);
    }
}