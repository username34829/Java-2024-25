public class Array {
	public static void main(String[] args) {
		String[] name = {"Joshan", "Lucmayan", "Aviles"};
		
		for (int tempName = 0; tempName < 3; tempName++) {
			System.out.println(name[tempName]);//Array iteration
		}
		
		System.out.println();
		for (int i =0; i < name.length; i++){
			System.out.println(name[i]);//Array length
		}
		
		System.out.println();
		
		for(String i : name){ // Enhance for loop
			System.out.println(i);
		}
	}
}