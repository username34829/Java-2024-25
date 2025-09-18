public class Main {
	public static void main(String[] args) {
		
		IsEven(12);
		
		for (int i = 0; i<=10; i++) {
			if (( i % 2 == 0) && (i ==0)) {
				System.out.print(i);
			}
		}
			
		
	}
	public static boolean IsEven(int n) {
		return (n % 2 == 0);
	}
	public static boolean IsOdd(int n) {
		return (n % 2 == 1);
	}
	
}