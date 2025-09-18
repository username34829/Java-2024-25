public class Main {
	public static void main(String[] args) {
		
		int age = 18;
		
		if(ageCheck(age)){
		    System.out.println("Your may sign up!");
		}
		else{
		    System.out.println("You must be 18+ to sign up!");
		}
	}
	static boolean ageCheck(int age){
	    if(age < 18){
	        return false;
	    }
	    return true;
	}
}