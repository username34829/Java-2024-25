public class Main {
	
	static int x = 3; // Class
	
	
	public static void main(String[] args) {
		
		// Variable scope - Local and Class
		
		int x = 1; // Local
		
		System.out.println(x);
		
		doSomething();
		
		System.out.println(Main.x);
		
	}
	static void doSomething(){
	    
	    int x = 2; // Local
	    
	    System.out.println(x);
	}
}