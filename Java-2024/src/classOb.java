import java.lang.Class;
import java.util.Scanner;

class User {
	
	String name;
	String gmail;
	String password;
	String mobileNumber;
	String code;
	static String TAG = "User's profile";
	
	User(String n, String g, String p, String m, String c) {
		
		name = n;
		gmail = g;
		password = p;
		mobileNumber = m;
		code = c;
		
	}
}


public class classOb {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		User ur = new User("", "", "", "", "");
		
		sout("Enter your Name: ");
		ur.name = sc.nextLine();
		
		sout("Enter your Gmail: ");
		ur.gmail = sc.nextLine();
		
		sout("Enter your Password: ");
		ur.password = sc.nextLine();
		
		sout("Enter your Mobile Number: ");
		ur.mobileNumber = sc.nextLine();
		
		sout("Enter your Authentication Code: ");
		ur.code = sc.nextLine();
		
		soutln("");
		soutln(ur.TAG);
		soutln("User Name: " + ur.name);
		soutln("User Gmail: " + ur.gmail);
		soutln("User Password: " + ur.password);
		soutln("User Mobile Number:j " + ur.mobileNumber);
		soutln("User Authentication Code: " + ur.code);
		System.out.println(ur);
		
		ur.TAG = "Application name.";
		soutln("You are register on " + ur.TAG);
		
		
	}
	
	public static void soutln(String s) {
		System.out.println(s);
	}
	public static void sout(String s) {
		System.out.print(s);
	}
	public static String soutlineInt(String x, int i) {
		String a = x + i;
		System.out.println(a);
		return a;
	}
}