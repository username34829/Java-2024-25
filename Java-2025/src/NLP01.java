public class Main {
	public static void main(String[] args) {
		
		for(int row = 0; row < 10; row++) {
			int OddEv = row % 2;
			if (OddEv == 0) {
				for(int col = 0; col < 10; col++) {
				System.out.print(">");
				}
			}
			else if (OddEv == 1) {
				for(int col = 0; col < 10; col++) {
				System.out.print("<");
				}
			}
			System.out.println("");
			
		}
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print(i);
			}
			
			System.out.println("");
		}
		
		
	}
}