public class Main {
	public static void main(String[] args) {
		int day = 18;
		
		
		switch(day) {
			case 1: case 2: case 3: 
			case 4: case 5: case 6:
			System.out.println("it's 1 - 6 days");
			break;
			case 7: case 8: case 9:
			case 10: case 11: case 12:
			case 13: case 14: case 15:
			System.out.println("it's 7-15 days");
			break;
			case 16: case 17: case 18:
			case 19: case 20: case 21:
			case 22: case 23: case 24:
			case 25:
			System.out.println("it's 16-25 days");
			break;
			case 26: case 27: case 28:
			case 29: case 30:
			System.out.println("it's last days of month"); 
			break;
		}
		
		
	}
}