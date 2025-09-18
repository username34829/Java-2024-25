public class Main {
	public static void main(String[] args) {
		
		// " ^ " Exclusive Or - When one statment is true = true
		//                      When all statment is true = false
		
		byte d1 = 1;
		byte d2 = 1;
		
		int s = d1 ^ d2;
		
		if(s > 0){
		    System.out.println("true");
		}
		else{
		    System.out.println("false");
		}
		
		
		int age = 23;
		
		if(age > 0 ^ age < 60){
		    System.out.println("You get pension");
		}
		else{
		    System.out.println("You dont get pension");
		}
	}
}