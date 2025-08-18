public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();

        System.out.println(pen.isUsing);
        pen.open();
        System.out.println(pen.isUsing);
        pen.write();
        pen.movementDown();
        pen.movementBackward();
        pen.movementForward();
        pen.movementRight();
        pen.movementLeft();
        pen.movementUp();
        pen.close();
        System.out.println(pen.isUsing);
    }
}
