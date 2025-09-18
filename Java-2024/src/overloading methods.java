public class Main {
	public static void main(String[] args) {
		int month = 9, days = 27, yr = 2024;
		
		System.out.println("Today is " + month + "/" + days + "/" + yr);
		System.out.println();
		Displaydate(month);
		Displaydate(month, days);
		Displaydate(month, days, yr);
	}
	public static void Displaydate(int mm)
	{
		System.out.println("Today is " + mm + "/27/2024"); 
	}
	public static void Displaydate(int mm, int dd)
	{
		System.out.println("Today is " + mm + "/" + dd + "/2024"); 
	}
	public static void Displaydate(int mm, int dd, int yr)
	{
		System.out.println("Today is " + mm + "/" + dd + "/" + yr); 
	}
	/* It is important to remember that you can overload
	 methods correctly by providing different parameter lists
	 for methods with the same name. Methods with identical names
	 that have identical parameter lists but different return types 
	 are not overloaded—they are illegal. */
}