public class AP01 {
	public static void main(String[] args) {
		String dada = "Christopher";
		String mama = "Shandy";
		String kuya = "Joshan";
		String ate = "Daisy";
		String ate1 = "Jandy";
		String ate2 = "Christine";
		String bunso = "Chloe";
		
		/* initializer list method*/
		String[] family = { dada, mama, kuya, ate, ate1, ate2, bunso};
		family[2] = "Lucmayan, Joshan A.";
		System.out.println(family[2]);
		
		System.out.println("");
		
		// length method
		for (int i = 0; i < family.length; i++) {
			System.out.print(family[i] + ", ");
		}
		System.out.println("");
		System.out.println("");
		// inhanced for loop method
		for(String i : family) {
			System.out.print(i + "- ");
		}
		
		System.out.println("");
		System.out.println("");
		/* new method */
		String[] names = new String[5];
		names[0] = "Hi im index 0";
		names[1] = "Hi im Index 1";
		System.out.println(names[0] + ", " + names[1]);
	}
}