
public class CarMain {
    
    public static void main(String[] args) {
        Car car1 = new Car("Porch", "911", "Red", 2025);
        
        car1.setBrand("McLaren");
        
        car1.display();
    }
    
}

class Car{
    private String brand;
    private String model;
    private String color;
    private int year;
    
    public Car(String brand, String model, String color, int year){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        
    }
    
    public void getBrand(String brand){
        this.brand = brand;
    }
    
    public String setBrand(String brand){
        return this.brand;
    }
    
    
    public void getModel(String model){
        this.model = model;
    }
    
    public String setModel(String model){
        return this.model;
    }
    
    public void getColor(String color){
        this.color = color;
    }
    
    public String setColor(String color){
        return this.color;
    }
    
    public void getYear(int year){
        this.year = year;
    }
    
    public int setYear(int year){
        return this.year;
    }
    
    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}