public class Main {
	public static void main(String[] args) {
		String y = "red horse";
		String x = "pepsi";
		String temp;
		
		temp = y;
		y = x;
		x = temp;
		
		
		System.out.println("y: "+y);
		System.out.println("x: "+x);
	}
}