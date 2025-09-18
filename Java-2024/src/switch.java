import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your day of exercise: ");
		int day = scanner.nextInt();
		
		String month = "Exercise";
		String w = "st";
		String x = "nd";
		String y = "rd";
		String z = "th";
		
		switch(day) {
			case 1: System.out.println("Today is the "+day +w+" day of your "+month); 
			break;
			case 2: System.out.println("Today is the "+day +x+" days of your "+month); 
			break;
			case 3: System.out.println("Today is the "+day +y+" days of your "+month); 
			break;
			case 4: System.out.println("Today is the "+day +z+" days of your "+month); 
			break;
			case 21: System.out.println("Today is the "+day +w+" days of your "+month); 
			break;
			case 22: System.out.println("Today is the "+day +x+" days of your "+month); 
			break;
			case 23: System.out.println("Today is the "+day +y+" days of your "+month); 
			break;
			case 24: System.out.println("Today is the "+day +z+" days of your "+month); 
			break;
			case 31: System.out.println("Today is the "+day +w+" days of your "+month); 
			break;
			case 32: System.out.println("Today is the "+day +x+" days of your "+month); 
			break;
			case 33: System.out.println("Today is the "+day +y+" days of your "+month); 
			break;
			case 34: System.out.println("Today is the "+day +z+" days of your "+month); 
			break;
			case 41: System.out.println("Today is the "+day +w+" days of your "+month); 
			break;
			case 42: System.out.println("Today is the "+day +x+" days of your "+month); 
			break;
			case 43: System.out.println("Today is the "+day +y+" days of your "+month); 
			break;
			case 44: System.out.println("Today is the "+day +z+" days of your "+month); 
			break;
			case 51: System.out.println("Today is the "+day +w+" days of your "+month); 
			break;
			case 52: System.out.println("Today is the "+day +x+" days of your "+month); 
			break;
			case 53: System.out.println("Today is the "+day +y+" days of your "+month); 
			break;
			case 54: System.out.println("Today is the "+day +z+" days of your "+month); 
			break;
			case 61: System.out.println("Today is the "+day +w+" days of your "+month); 
			break;
			case 62: System.out.println("Today is the "+day +x+" days of your "+month); 
			break;
			case 63: System.out.println("Today is the "+day +y+" days of your "+month); 
			break;
			case 64: System.out.println("Today is the "+day +z+" days of your "+month); 
			break;
			case 71: System.out.println("Today is the "+day +w+" days of your "+month); 
			break;
			case 72: System.out.println("Today is the "+day +x+" days of your "+month); 
			break;
			case 73: System.out.println("Today is the "+day +y+" days of your "+month); 
			break;
			case 74: System.out.println("Today is the "+day +z+" days of your "+month); 
			break;
			case 81: System.out.println("Today is the "+day +w+" days of your "+month); 
			break;
			case 82: System.out.println("Today is the "+day +x+" days of your "+month); 
			break;
			case 83: System.out.println("Today is the "+day +y+" days of your "+month); 
			break;
			case 84: System.out.println("Today is the "+day +z+" days of your "+month); 
			break;
			case 91: System.out.println("Today is the "+day +w+" days of your "+month); 
			break;
			case 92: System.out.println("Today is the "+day +x+" days of your "+month); 
			break;
			case 93: System.out.println("Today is the "+day +y+" days of your "+month); 
			break;
			case 94: System.out.println("Today is the "+day +z+" days of your "+month); 
			break;
		}
		
		if (day>4 && day<21) {
			System.out.println("Today is the "+day +z+" days of your "+month);
		}
		if (day>24 && day<31) {
			System.out.println("Today is the "+day +z+" days of your "+month);
		}
		if (day>34 && day<41) {
			System.out.println("Today is the "+day +z+" days of your "+month);
		}
		if (day>54 && day<61) {
			System.out.println("Today is the "+day +z+" days of your "+month);
		}
		if (day>64 && day<71) {
			System.out.println("Today is the "+day +z+" days of your "+month);
		}
		if (day>74 && day<81) {
			System.out.println("Today is the "+day +z+" days of your "+month);
		}
		if (day>84 && day<91) {
			System.out.println("Today is the "+day +z+" days of your "+month);
		}
		if (day>94 && day<101) {
			System.out.println("Today is the "+day +z+" days of your "+month);
		}
		
		System.out.print(" Congratulation!! Keep it up and good luck on your journey.");
	}
}