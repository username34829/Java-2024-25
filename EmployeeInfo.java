import java.util.Scanner;
public class EmployeeInfo {
    public static void main(String[] args){
        Employee employee;
        
        Scanner scanner = new Scanner(System.in);
        int id;
        String firstName;
        String lastName;
        String midName;
        String address;
        String birthdate;
        
        System.out.println("Enter Id: ");
        id = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();
        
        System.out.print("Enter Middle Name: ");
        midName = scanner.nextLine();
        
        System.out.print("Enter Address: ");
        address = scanner.nextLine();
        
        System.out.print("Enter Birthdate (12/25/2005): ");
        birthdate = scanner.nextLine();
        
        
        
        
    }
    
}
class Employee{
    private int id;
    private String lastName;
    private String firstName;
    private String midName;
    private String address;
    private String birthdate;
    
    public Employee(int id, String lastName, String firstName, String midName, String address, String birthdate){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.midName = midName;
        this.address = address;
        this.birthdate = birthdate;
        
    }
    
    //Get
    public void getId(int id){
        this.id = id;
    }
    
    public void getLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void getFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void getMidName(String midName){
        this.midName = midName;
    }
    
    public void getAddress(String address){
        this.address = address;
    }
    
    public void getMonth(String month){
        this.birthdate = birthdate;
    }
    
    
    //Set
    public int setId(int id){
        return this.id;
    }
    
    public String setLastName(String lastName){
        return this.lastName;
    }
    
    public String setFirstName(String firstName){
        return this.firstName;
    }
    
    public String setMidName(String midName){
        return this.midName;
    }
    
    public String setAddress(String address){
        return this.address;
    }
    
    public String setBirthdate(String birthdate){
        return this.birthdate;
    }
    
    public void displayEmployeeInfo(){
        System.out.println("[Employee Information]");
        System.out.println("Id: " + id);
        System.out.printf("Name: %s, %s %s. \n", lastName, firstName, midName);
        System.out.println("Address: " + address);
        System.out.printf("Birthdate: %s/%d/%d", month, day, year);
        
    }
    
    
    
}