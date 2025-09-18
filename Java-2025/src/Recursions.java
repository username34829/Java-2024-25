
public class Recursions {
    
    public static void main(String[] args) {
        sayHi(10);
    }
    private static void sayHi(int count) {
    	System.out.println("HI");
    	
        if (count <= 1) { // base case
        	return;
        }
    	sayHi(count - 1);
    }
    
}