import java.util.Scanner;
class Student // class
{
	private String StudentName; // Data Feild
	private int TheirAge;
	
	public void setStudentName(String name) // Method
	{
		StudentName = name;
	}
	public void setTheirAge(int age)
	{
		TheirAge = age;
	}
	public String getStudentName()
	{
		return StudentName;
	}
	public int getTheirAge()
	{
		return TheirAge;
	}
}

public class CreateStudenNameAge // main class
{
	public static void main(String[] args)
	{
		
		String name;
		int age;
		
		Student fStudent = new Student();
		Student sStudent = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Student name >> ");
		name = sc.nextLine();
		
		System.out.print("Enter First Student age >> ");
		age = sc.nextInt();
		
		fStudent.setStudentName(name);
		fStudent.setTheirAge(age);
		
		sc.nextLine();
		System.out.print("Enter Second Student name >> ");
		name = sc.nextLine();
		
		System.out.print("Enter Second Student age >> ");
		age = sc.nextInt();
		
		System.out.println();
		
		sStudent.setStudentName(name);
		sStudent.setTheirAge(age);
		
		System.out.print("First Student details: "); 
		System.out.print(fStudent.getStudentName() + "\n" + fStudent.getTheirAge() + " years old\n");
		
  System.out.println();
		                   
		System.out.print("Second Student details: " + 
		                   sStudent.getStudentName() + "\n" + sStudent.getTheirAge()
		                   + " years old\n");
		
	}
}