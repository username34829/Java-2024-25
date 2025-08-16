public class Main {
	public static void main(String[] args) {
		
		int[][] number;
		number = new int[2][3];
		
		number[0][0] = 40;
		number[0][1] = 50;
		number[0][2] = 60;
		
		number[1][0] = 400;
		number[1][1] = 500;
		number[1][2] = 600;
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 3; j++){
				System.out.println(number[i][j]);
			}
		}
		
		
		
		
		
		System.out.println();
		
		
		
		int[][] integers = {
		                    {10, 20, 30}, 
		                    {100, 200, 300, 333},
		                    {111, 222}
		                    };
		
		for(int i = 0; i < integers.length; i++){
			for(int j = 0; j < integers[i].length; j++){
				System.out.print(integers[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println();
		
		String[][] name = new String[1][4];
		
		name[0][0] = "Your";
		name[0][1] = "Not";
		name[0][2] = "Good";
		name[0][3] = "Enough";
		
		for(int i = 0; i < name.length; i++){
			for(int j = 0; j < name[i].length; j++){
				System.out.print(name[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------");
		
	}
}