public class Main {
	public static void main(String[] args) {
		int[][] multiTable = new int[10][10];
		
		for(int row = 0; row < multiTable.length; row++){
		    for(int col = 0; col < multiTable.length; col++){
		        multiTable[row][col] = row * col + col + 1 + row;
		        System.out.print(multiTable[row][col] + " ");
		    }
		    System.out.println();
		    //1 2 3... 10
		    
		}
		
	}
}