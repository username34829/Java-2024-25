import java.util.Random;
public class Main {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		int count = 5;
		 while (true) {
		 	System.out.println("This is an infinit loop");
		 	int randNum = random.nextInt(100) + 1;
		 	
		 	if(randNum > 75) {
		 		System.out.println("The loop has ended");
		 		break;
		 	}
		 }
	}
}