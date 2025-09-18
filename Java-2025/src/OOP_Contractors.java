public class Main {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1234, "Joshan", "Worker", 86000);
		Employee emp2 = new Employee(5678, "John", "Worker", 90000);
		
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.position);
		System.out.println(emp1.salary);
		emp1.dayOff();
		
		System.out.println();
		
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.position);
		System.out.println(emp2.salary);
		emp2.dayOff();
	}
}

class Employee{
    
    int id;
    String name;
    String position;
    double salary;
    
    
    Employee(int id, String name, String position, double salary){
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    
    void dayOff(){
        System.out.println(this.name + " is currently on vacation.");
    }
}