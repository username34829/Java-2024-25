public class Main{
    public static void main(String[] args){
        Subject subject = new Subject("1234567", 98, 84,85, 90);

        subject.setPrelim(75);
        subject.displayInfo();
        subject.calculateAverage();

    }
}
