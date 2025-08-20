public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Fountain", "Black", "Medium");
        Pen pen2 = new Pen("Fountain", "Red", "Fine");
        Pen pen3 = new Pen("Fountain", "Blue", "Extra Fine");

        Pen[] pens = {pen1, pen2, pen3};

        Pen.showNumOfPen();

        for(Pen pen : pens){
            pen.available();
        }
    }
}