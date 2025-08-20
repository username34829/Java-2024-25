public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen("Fountain");
        Pen pen3 = new Pen("Ball", "Black");
        Pen pen4 = new Pen("Fountain", "Black", "Extra Fine");
        Pen pen5 = new Pen("Ball", "Red", "Medium", 50);

        System.out.println(pen1.pen);
        System.out.println(pen1.color);
        System.out.println(pen1.nimbSize);
        System.out.println(pen1.price);

        System.out.println(pen2.pen);
        System.out.println(pen2.color);
        System.out.println(pen2.nimbSize);
        System.out.println(pen2.price);

        System.out.println(pen3.pen);
        System.out.println(pen3.color);
        System.out.println(pen3.nimbSize);
        System.out.println(pen3.price);

        System.out.println(pen4.pen);
        System.out.println(pen4.color);
        System.out.println(pen4.nimbSize);
        System.out.println(pen4.price);

        System.out.println(pen5.pen);
        System.out.println(pen5.color);
        System.out.println(pen5.nimbSize);
        System.out.println(pen5.price);
    }
}