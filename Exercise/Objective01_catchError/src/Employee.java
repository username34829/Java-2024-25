public class Employee {

    String firstName;
    String lastName;
    int id;
    double salary;

    Employee(String firstName, String lastName, int id, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    void displayEmployeeInfo(){
        System.out.println("-------Profile------");
        System.out.printf("Name: %s %s\n", this.lastName, this.firstName);
        System.out.println("ID: " + this.id);
        System.out.printf("Salary: $%.2f\n", this.salary);
        System.out.println("---------//---------");

    }
}
