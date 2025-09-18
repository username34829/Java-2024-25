import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			String[] names = new String[3]; // Input 4 names
			Scanner scanner = new Scanner(System.in);

			for (int i = 0; i <= names.length; i++) {
				names[i] = scanner.nextLine();
			}

			System.out.println();

			for (String name : names) {
				System.out.println(name);
			}
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
