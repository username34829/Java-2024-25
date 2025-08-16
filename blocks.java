public class Main {
	public static void main(String[] args) 
	{// opening outer block
		int aNumber = 10;
		System.out.println(aNumber);
		
		 { // opening inner block
		 	int anotherNumber = 150;
		 	System.out.println(anotherNumber);
		 } // closing inner block
		 
		System.out.println(aNumber);
		aNumber();
		anotherNumber();
		
		}// closing outer block
		
		/* 
		
		out put should be:
		10
		150
		10
		10
		150
		
		*/
 public static void aNumber() // create new blocks
 {
 	int aNumber = 10;
  System.out.println(aNumber);
 }
 public static void anotherNumber()
 {
 	int anotherNumber = 150;
 	System.out.println(anotherNumber);
 }
}	