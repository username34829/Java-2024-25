public class Pen {

    //Attributes
    String pen = "Fountain";
    String ink = "Water based ink";
    String brand = "Aurora";
    String color = "Black";
    String madeFrom = "Made in UK";
    String nimbSize = "Medium"; //Fine //Extra Fine //Medium
    int year = 2025;
    int price = 2200; //Dollar
    boolean isUsing = false;

    //Methods
    void open(){
        System.out.println("You open your pen");
        isUsing = true;
    }
    void close(){
        System.out.println("You close your pen");
        isUsing = false;
    }

    void write(){
        System.out.println("You start writing");
    }

    //Movement
    void movementLeft(){
        System.out.println("You move your pen to the left");
    }
    void movementRight(){
        System.out.println("You move your pen to the right");
    }
    void movementForward(){
        System.out.println("You move your pen forward");
    }
    void movementBackward(){
        System.out.println("You move your pen backward");
    }
    void movementUp(){
        System.out.println("You up your pen");
    }
    void movementDown(){
        System.out.println("You down your pen");
    }

}

