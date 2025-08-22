import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        // Objective: catch error and display input

        String lastName = "";
        String firstName = "";
        int id = 0;
        double salary = 0;
        Employee employee;


        try{
            System.out.print("Enter Last name: ");
            lastName = scanner.nextLine();

            while(true){
                if(!lastName.matches("[a-z-A-Z]+")){
                    System.out.println("[ Invalid Last Name, Please Try Again! ]");
                    System.out.print("Enter Last name: ");
                    lastName = scanner.nextLine();
                }
                else{
                    break;
                }
            }

            System.out.print("Enter First name: ");
            firstName = scanner.nextLine();

            while(true){
                if(!firstName.matches("[a-z-A-Z]+")){
                    System.out.println("[ Invalid First Name, Please Try Again! ]");
                    System.out.print("Enter First name: ");
                    firstName = scanner.nextLine();
                }
                else{
                    break;
                }
            }

            while(true){
                System.out.print("Enter Id: ");
                try{
                     id = Integer.parseInt(scanner.nextLine());
                    break;
                }catch(NumberFormatException e){
                    System.out.println("[ Invalid number, Please Try Again! ]");
                }
            }

            while(true){
                System.out.print("Enter Salary: ");
                try{
                    salary = Double.parseDouble(scanner.nextLine());
                    break;
                }catch(NumberFormatException e){
                    System.out.println("[ Invalid number, Please Try Again! ]");
                }
            }



        } catch (Exception e) {
            System.out.println("Error Occur: Exiting..."); // if something happen it will catch the error
        }

        employee = new Employee(firstName, lastName, id, salary);

        employee.displayEmployeeInfo();



    }
}
