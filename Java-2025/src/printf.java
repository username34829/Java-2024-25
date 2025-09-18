public class printf {
	public static void main(String[] args) {
		// printf() = is a method used to format output
		
		String name = "Joshan";
		char firstName = 'J';
		int age = 19;
		double height = 5.2;
		boolean isStudent = true;
		
		System.out.printf("Hello %s\n", name);
		System.out.printf("Your name starts with: %c\n", firstName);
		System.out.printf("Your age is: %d Years old\n", age);
		System.out.printf("Your Height: %f inches tall\n", height);
		System.out.printf("Are You a Student: %b\n", isStudent);
		System.out.println("----------------------");
		System.out.printf("%s is %d Years old\n", name, age);
		
		
		System.out.println();
		System.out.println();
		
		double price = 9.99;
		double price2 = 10000000.89;
		double price3 = -55.99;
		double price4 = 20.22;
		
		System.out.printf("%+.1f\n", price);
		System.out.printf("%,.2f\n", price2);
		System.out.printf("%(.2f\n", price3);
		System.out.printf("% .2f", price4);
		
		System.out.println();
		System.out.println("----------------------");
		System.out.println();
		
		
		int id1 = 1;
		int id2 = 23;
		int id3 = 456;
		int id4 = 7890;
		
		System.out.printf("%04d\n", id1);
		System.out.printf("%4d\n", id2);
		
		System.out.printf("%-4d", id3);
		System.out.printf("09898\n");
		
		System.out.printf("%4d\n", id4);
		
		
	}
}