import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
  print("What is your score? >> ");
  int score = sc.nextInt();
  name = sc.nextLine();
		print("Enter your name >> ");
		name = sc.nextLine();
		print("Enter your age >> ");
		age = sc.nextInt();
		
		println("");
		
		System.out.println("Your name is " + name + "\nYour age is "+ age +"\nand Your score is " + score);
		
		
	}
	public static void println(String s)
	{
		System.out.println(s);
	}
	public static void print(String s)
	{
		System.out.print(s);
	}
}