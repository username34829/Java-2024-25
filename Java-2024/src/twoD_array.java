public class Main {
	public static void main(String[] args) {
		String[][] name = { {"bob", "ken", "meno"},
		                    {"shen", "yen", "mizaki"},
		                    {"Bosh", "Yale", "Iza"}
		};
		name[0][2] = "Zen";
		//2D array iterate
		System.out.println("You select the name of: " + name[0][2]);
		//System.out.println(name.length + " rows");
		//System.out.println(name[1].length + " columns");
		
		//2D array length
		System.out.println();
		for (int a = 0; a < name.length; a++) {
			for (int i = 0; i < name[0].length; i++) {
				if (i == name[0].length -1) {
				    System.out.println(name[a][i]);
				}
				else {
					System.out.print(name[a][i] + " ");
				}
			}
		}
		//Enhance for loop
		System.out.println();
		for (String[] a : name) {
			for (String i : a) {
				if ((i.equals("Zen")) | (i.equals("mizaki")) | (i.equals("Iza"))) {
				    System.out.println(i);
				}
				else {
					System.out.print(i + " ");
				}
			}
		}
		
		
		
		
		
	}
}