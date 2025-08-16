import java.util.Scanner;
import java.util.ArrayList;

class Employee {
    int id;
    String name;
    String position;
    double salary;

    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

public class EMPLYO {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int option = getValidIntInput("Choose an option: ");
            switch (option) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateSalary();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nEmployee Management System");
        System.out.println("[1] Add Employee");
        System.out.println("[2] View Employees");
        System.out.println("[3] Search Employee");
        System.out.println("[4] Update Salary");
        System.out.println("[5] Delete Employee");
        System.out.println("[6] Exit");
    }

    private static int getValidIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static double getValidDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static String getValidStringInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Invalid input. Please enter a valid string.");
        }
    }

    private static void addEmployee() {
        int id;

        while (true) {
            System.out.print("Enter Employee ID: ");
            String input = scanner.nextLine();

            try {
                id = Integer.parseInt(input.replace("-", ""));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Employee ID. Please enter a valid number.");
            }
        }

        String name = getValidStringInput("Enter Name: ");
        String position = getValidStringInput("Enter Position: ");
        double salary = getValidDoubleInput("Enter Salary: ");

        System.out.println("\nPlease confirm the information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);

        System.out.print("Is this correct? (yes/no): ");
        String confirmation = scanner.nextLine().trim().toLowerCase();

        if (!confirmation.equals("yes")) {
            System.out.println("Employee addition cancelled.");
            return;
        }

        employees.add(new Employee(id, name, position, salary));
        System.out.println("Employee added successfully!");
    }

    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

    private static void searchEmployee() {
        System.out.println("Search by:");
        System.out.println("[1] Employee ID");
        System.out.println("[2] Employee Name");
        int searchOption = getValidIntInput("Choose an option: ");

        switch (searchOption) {
            case 1:
                int id = getValidIntInput("Enter Employee ID to search: ");
                Employee empById = findEmployeeById(id);
                if (empById != null) {
                    System.out.println(empById);
                } else {
                    System.out.println("Employee not found.");
                }
                break;
            case 2:
                String name = getValidStringInput("Enter Employee Name to search: ");
                ArrayList<Employee> employeesByName = findEmployeesByName(name);
                if (!employeesByName.isEmpty()) {
                    for (Employee emp : employeesByName) {
                        System.out.println(emp);
                    }
                } else {
                    System.out.println("No employees found with the given name.");
                }
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private static Employee findEmployeeById(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'findEmployeeById'");
    }

    private static ArrayList<Employee> findEmployeesByName(String name) {
        ArrayList<Employee> matchingEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.name.equalsIgnoreCase(name)) {
                matchingEmployees.add(emp);
            }
        }
        return matchingEmployees;
    }

    private static void updateSalary() {
        System.out.println("Update salary by:");
        System.out.println("[1] Employee ID");
        System.out.println("[2] Employee Name");
        int searchOption = getValidIntInput("Choose an option: ");

        switch (searchOption) {
            case 1:
                int id = getValidIntInput("Enter Employee ID to update salary: ");
                Employee empById = findEmployeeById(id);
                if (empById != null) {
                    double newSalary = getValidDoubleInput("Enter new Salary: ");
                    empById.salary = newSalary;
                    System.out.println("Salary updated successfully!");
                } else {
                    System.out.println("Employee not found.");
                }
                break;
            case 2:
                String name = getValidStringInput("Enter Employee Name to update salary: ");
                ArrayList<Employee> employeesByName = findEmployeesByName(name);
                if (employeesByName.size() == 1) {
                    Employee empByName = employeesByName.get(0);
                    double newSalary = getValidDoubleInput("Enter new Salary: ");
                    empByName.salary = newSalary;
                    System.out.println("Salary updated successfully!");
                } else if (employeesByName.isEmpty()) {
                    System.out.println("No employees found with the given name.");
                } else {
                    System.out.println("Multiple employees found with the given name:");
                    for (Employee emp : employeesByName) {
                        System.out.println(emp);
                    }
                    int selectedId = getValidIntInput("Enter the Employee ID of the employee you want to update: ");
                    Employee selectedEmp = findEmployeeById(selectedId);
                    if (selectedEmp != null && employeesByName.contains(selectedEmp)) {
                        double newSalary = getValidDoubleInput("Enter new Salary: ");
                        selectedEmp.salary = newSalary;
                        System.out.println("Salary updated successfully!");
                    } else {
                        System.out.println("Invalid Employee ID selected.");
                    }
                }
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private static void deleteEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("List of Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\nOptions:");
        System.out.println("[1] Delete a specific employee by ID");
        System.out.println("[2] Delete a specific employee by Name");
        System.out.println("[3] Delete all employees");
        int choice = getValidIntInput("Choose an option: ");

        switch (choice) {
            case 1:
                int id = getValidIntInput("Enter Employee ID to delete: ");
                Employee empById = findEmployeeById(id);
                if (empById != null) {
                    employees.remove(empById);
                    System.out.println("Employee deleted successfully!");
                } else {
                    System.out.println("Employee not found.");
                }
                break;
            case 2:
                String name = getValidStringInput("Enter Employee Name to delete: ");
                ArrayList<Employee> employeesByName = findEmployeesByName(name);
                if (employeesByName.size() == 1) {
                    employees.remove(employeesByName.get(0));
                    System.out.println("Employee deleted successfully!");
                } else if (employeesByName.isEmpty()) {
                    System.out.println("No employees found with the given name.");
                } else {
                    System.out.println("Multiple employees found with the given name:");
                    for (Employee emp : employeesByName) {
                        System.out.println(emp);
                    }
                    int selectedId = getValidIntInput("Enter the Employee ID of the employee you want to delete: ");
                    Employee selectedEmp = findEmployeeById(selectedId);
                    if (selectedEmp != null && employeesByName.contains(selectedEmp)) {
                        employees.remove(selectedEmp);
                        System.out.println("Employee deleted successfully!");
                    } else {
                        System.out.println("Invalid Employee ID selected.");
                    }
                }
                break;
            case 3:
                System.out.print("Are you sure you want to delete all employees? (yes/no): ");
                String confirmation = scanner.nextLine().trim().toLowerCase();
                if (confirmation.equals("yes")) {
                    employees.clear();
                    System.out.println("All employees deleted successfully!");
                } else {
                    System.out.println("Operation cancelled.");
                }
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}