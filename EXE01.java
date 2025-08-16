import java.util.Scanner;
public class EXE01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Joshan\n");
		System.out.println("\tLucmayan");
		System.out.print("What is your age: ");
		int age = sc.nextInt();
		
		System.out.println("Your age is: " + age);*/
		int menu = 0;
		
		do {
			System.out.print("Enter first number: ");
			int a = sc.nextInt();
			System.out.print("Enter sec number: ");
			int b = sc.nextInt();
		
			System.out.print("MENU:\n" + 
		                   	"1.Multi\n" + 
		                  	 "2.Add\n" + 
		              	     "3.Sub\n" + 
		               	    "4.Div\n" + 
		               	    "5.Exit\n" + 
		               	    "- ");
			menu = sc.nextInt();
			System.out.println("----------------------");
			switch(menu){
				case 1: System.out.println("Answer: " + multi(a, b));
				break;
				case 2: System.out.println("Answer: " + add(a, b));
				break;
				case 3: System.out.println("Answer: " + sub(a, b));
				break;
				case 4: System.out.println("Answer: " + div(a, b));
				break;
				case 5: System.out.println("Thank you for using this program.");
				break;
				}
			System.out.println("----------------------");
				
		}while(menu!=5);
		
	}
	public static int multi(int a, int b){
		int x = a * b;
		return x;
	}
	public static int add(int a, int b){
		int x = a + b;
		return x;
	}
	public static int sub(int a, int b){
		int x = a - b;
		return x;
	}
	public static int div(int a, int b){
		int x = a / b;
		return x;
	}
}