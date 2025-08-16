public class Main {
	public static void main(String[] args) {
		Employee employeeData = new Employee();
		
		employeeData.name = "Deshawn";
		System.out.println(employeeData.position);
		System.out.println(employeeData.name);
		System.out.println(employeeData.id);
		System.out.println(employeeData.salary);
		
		System.out.println();
		
		employeeData.working();
		employeeData.dayOff();
		
	}
}

class Employee {
    
    String name = "Joshan";
    String position = "Employer";
    int id = 1234;
    double salary = 85000.99;
    
    void working(){
        System.out.println("He's working rn.");
    }
    
    void dayOff(){
        System.out.println("Currently on Vacation");
    }
    
}