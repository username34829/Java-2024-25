import java.util.ArrayList;
import java.util.Scanner;

class Employee {
	String name;
	int id;
	String position;
	double salary;

	Employee(int id, String name, String position, double salary) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	void displayInfo() {
		System.out.println("\nEmployee ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Position: " + position);
		System.out.println("Salary: $" + salary);
	}
}

public class Employee_Management {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Employee> employeeList = new ArrayList<>();
	static boolean isRunning = true;

	public static void main(String[] args) {
		while (isRunning) {
			displayMenu();
		}
	}

	static void displayMenu() {
		System.out.println("\n[Employee Management System]");
		System.out.println("1. Add");
		System.out.println("2. View");
		System.out.println("3. Search");
		System.out.println("4. Update Salary");
		System.out.println("5. Delete");
		System.out.println("6. Exit");
		System.out.print("- ");

		String input = scanner.nextLine();

		try {
			int choice = Integer.parseInt(input);

			switch (choice) {
				case 1: addEmployee(); break;
				case 2: viewEmployees(); break;
				case 3: searchEmployee(); break;
				case 4: updateSalary(); break;
				case 5: deleteEmployee(); break;
				case 6: exitSystem(); break;
				default: System.out.println("~~ Invalid choice, please select a valid option ~~");
			}
		} catch (NumberFormatException e) {
			System.out.println("~~ Invalid input, please enter a number ~~");
		}
	}

	static void addEmployee() {
		System.out.println("\n[Add Employee]");
		
		int id = validateInt("Enter Employee ID: ");
		String name = validateString("Enter Employee Name: ");
		String position = validateString("Enter Employee Position: ");
		double salary = validateDouble("Enter Salary: ");

		employeeList.add(new Employee(id, name, position, salary));
		System.out.println("- Employee Successfully Added!");
	}

	static void viewEmployees() {
		System.out.println("\n[View Employees]");
		if (employeeList.isEmpty()) {
			System.out.println("~~ No Employees Found ~~");
			return;
		}
		for (Employee emp : employeeList) {
			emp.displayInfo();
		}
	}

	static void searchEmployee() {
		System.out.println("\n[Search Employee]");
		String search = validateString("Search (Name/ID): ");

		boolean found = false;
		for (Employee emp : employeeList) {
			if (emp.name.equalsIgnoreCase(search) || String.valueOf(emp.id).equals(search)) {
				emp.displayInfo();
				found = true;
			}
		}

		if (!found) {
			System.out.println("~~ Employee Not Found ~~");
		}
	}

	static void updateSalary() {
		System.out.println("\n[Update Salary]");
		int id = validateInt("Enter Employee ID: ");

		for (Employee emp : employeeList) {
			if (emp.id == id) {
				System.out.println("- Current Salary: $" + emp.salary);
				emp.salary = validateDouble("Enter New Salary: ");
				System.out.println("- Salary Successfully Updated!");
				return;
			}
		}

		System.out.println("~~ Employee Not Found ~~");
	}

	static void deleteEmployee() {
		System.out.println("\n[Delete Employee]");
		int id = validateInt("Enter Employee ID: ");

		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).id == id) {
				employeeList.remove(i);
				System.out.println("- Employee Successfully Deleted!");
				return;
			}
		}

		System.out.println("~~ Employee Not Found ~~");
	}

	static void exitSystem() {
		System.out.println("\nExiting...");
		isRunning = false;
	}

	static int validateInt(String message) {
		while (true) {
			System.out.print(message);
			String input = scanner.nextLine();

			try {
				int value = Integer.parseInt(input);
				if (value > 0) return value;
				System.out.println("~~ Input must be greater than zero ~~");
			} catch (NumberFormatException e) {
				System.out.println("~~ Invalid input, please enter a valid number ~~");
			}
		}
	}

	static String validateString(String message) {
		while (true) {
			System.out.print(message);
			String input = scanner.nextLine().trim();

			if (!input.isEmpty() && input.matches("[a-zA-Z ]+")) {
				return input;
			}
			System.out.println("~~ Invalid input, must contain only letters ~~");
		}
	}

	static double validateDouble(String message) {
		while (true) {
			System.out.print(message);
			String input = scanner.nextLine();

			try {
				double value = Double.parseDouble(input);
				if (value > 0) return value;
				System.out.println("~~ Input must be greater than zero ~~");
			} catch (NumberFormatException e) {
				System.out.println("~~ Invalid input, please enter a valid number ~~");
			}
		}
	}
}