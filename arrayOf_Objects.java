public class Main {
	public static void main(String[] args) {
		
		/*
		Student student = new Student("Lucmayan Joshan", 19);
		Student student2 = new Student("John Joe", 19);
		Student student3 = new Student("Litsu Hinsian", 18);
		
		student.enrolled();
		student2.enrolled();
		student3.enrolled();
		
		
		System.out.println("-------------");
		
		Student[] studnt = {student, student2, student3};
		
		for(int i = 0; i < studnt.length; i++){
		    studnt[i].enrolled();
		}
		
		System.out.println("-----Enhance For loop-------------");
		for(Student i : studnt){
		    i.enrolled();
		}
		*/
		
		Student[] student = {new Student("Lucmayan Joshan", 19),
		                     new Student("John Joe", 19),
		                     new Student("Litsu Hinsian", 18)};
		
		
		for(Student a : student){
		    a.enrolled();
		}
		
	}
}
class Student{
    String name;
    int age;
    
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void enrolled(){
        System.out.println("Student " + this.name + ", \n" + this.age + " Years old" + " is enrolled.\n");
    }
}