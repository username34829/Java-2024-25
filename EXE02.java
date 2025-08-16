import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[10];
		
		ArrayList<String> name2 = new ArrayList<>();
		
		
		name2.add("Bob Smith");
		name2.add("John Smith");
		name2.set(0, "Bomb Smithh");
		// get, add, set, remove
		
		System.out.println(name2.size());
		
		
		for (int i = 0; i < name.length; i++){
			System.out.print("name"+ i + ": ");
			name[i] = sc.nextLine();
			
			
		}
		
		for (int i = 0; i < name.length; i++){
			System.out.println(name[i]);
			
		}
		
		
		
		
		
		int[] number = {10, 30, 20, 40};
		
		System.out.println(number[0]);
		
		number[0] = 100;
		
		System.out.println(number[0]);
		
		
	}
}