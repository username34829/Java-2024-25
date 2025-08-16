import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(100);
		num.add(200);
		num.add(300);
		//add
		System.out.println(num);
		//get
		System.out.println(num.get(1));
		//set
		num.set(5, (1200));
		System.out.println(num);
		//remove
		num.remove(1);
		System.out.println(num);
		
		System.out.println();
		
		Iterate();
		
		System.out.println();
		System.out.println();
		
		Enhancefor();
	}
	public static void Iterate() {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(100);
		num.add(200);
		num.add(300);
	    
	    for (int i = 0; i < num.size(); i++) {
	    	System.out.print(num.get(i) + " ");
	    }
	}
	
	public static void Enhancefor() {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(100);
		num.add(200);
		num.add(300);
		
		for (Integer i : num) {
			System.out.print(i + " ");
		}
	}
}