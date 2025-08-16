import java.util.Scanner;
public class Main34 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pen pen;
        
        String pens;
        String color;
        String brand;
        String madeFrom;
        
        System.out.print("Enter Pen: ");
        pens = scanner.nextLine();
        
        System.out.print("Enter Color: ");
        color = scanner.nextLine();
        
        System.out.print("Enter Brand: ");
        brand = scanner.nextLine();
        
        System.out.print("Enter Made From: ");
        madeFrom = scanner.nextLine();
        
        pen = new Pen(pens, color, brand, madeFrom);
        
        pen.display();
    }
    
}
class Pen{
    //Types of:
    private String _pen;
    private String _color;
    private String _brand;
    private String _madeFrom;
    
    public String pen = _pen;
    public String color = _color;
    public String brand = _brand;
    public String madeFrom = _madeFrom;
    
    public Pen(String pen, String color, String brand, String madeFrom){
        this._pen = pen;
        this._color = color;
        this._brand = brand;
        this._madeFrom = madeFrom;
    }
    
    //Get
    public void getPen(String pen){
        this._pen = pen;
    }
    public void getColor(String color){
        this._color = color;
    }
    public void getBrand(String brand){
        this._brand = brand;
    }
    public void getMadeFrom(String madeFrom){
        this._madeFrom = madeFrom;
    }
    
    //Set
    public String setPen(String pen){
        return this.pen;
    }
    public String setColor(String color){
        return this.color;
    }
    public String setBrand(String brand){
        return _brand;
    }
    public String setMadeFrom(String madeFrom){
        return _madeFrom;
    }
    
    public void display(){
        System.out.println("These are the information you enter: ");
        System.out.println("Pen: " + pen);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Made From: " + madeFrom);
    }
}