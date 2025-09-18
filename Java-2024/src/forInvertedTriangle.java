
public class forInvertedTriangle {
	public static void main(String[] args) {
		byte line = 3;
		byte x = 1;
		
		lone();
	  
		for (byte a = 0; a <= line; a++) {
			
			
			for(byte c = 1; c <= 1 + a; c++) {
				System.out.print(" ");
			}
			
			for(byte b = 1; b <= x; b++) {
				System.out.print("*");
			}
			for(byte c = 1; c <= 7 - a - a; c++) {
				System.out.print(" ");
			}
			
			for(byte b = 1; b <= 1; b++) {
				System.out.println("*");
			}
			
		
		}
		
		if (line>= 1) {
		    for (byte q = 1; q <= 5; q++) {
			    System.out.print(" ");
		    }
		    
	        System.out.println("*");
		}
		
	}
	
	public static void lone() {
		for (byte a = 1; a <= 5; a++) {
			for(byte b = 1; b <= 1; b++) {
				System.out.print("*");
			}
			
			for(byte c = 1; c <= 1; c++) {
				System.out.print(" ");
			}
		}
		
		for(byte b = 1; b <= 1; b++) {
				System.out.print("*");
		}
		System.out.println();
	}
}