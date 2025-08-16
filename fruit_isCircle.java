import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
	    launch();
	}
	
	
	static void launch() {
		
		Scanner scanner = new Scanner(System.in);
		String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Kiwi", "Grape", "Pineapple", "Palm"};
		boolean[] isCircle = {false, false, true, false, true, true, false, true};
		
		String enter;
		String numFruit;
		boolean isFound = false;
		
		
		System.out.print("Enter fruit Name: ");
		enter = scanner.nextLine();
		
		if(enter.isEmpty()){
		    System.out.println("- Cannot be empty, Try Again! -");
		    System.exit(0);
		}
		
		int lastIndex = enter.length();
		String fruit = enter.substring(0,1).toUpperCase() + enter.substring(1, lastIndex).toLowerCase();
		
		for(int i = 0; i < fruits.length; i++){
		    if(fruits[i].equals(fruit)){
		        isFound = true;
		        if(isCircle[i]){
		            System.out.println("is Circle: Yes");
		        }
		        else{
		            System.out.println("is Circle: No");
		        }
		    }
		}
		
		if(!isFound){
		    System.out.println("- Fruit Name not Found -");
		}
		
		//NextLine
		System.out.println();
		
		System.out.print("Enter count: ");
		numFruit = scanner.nextLine();
		
		try{
		    int newNumFruit = Integer.parseInt(numFruit);
		    if(newNumFruit <= 0){
		        System.out.println("- Amount cannot be lower than/equal to zero! -");
		        
		    }
		    else{
		        System.out.println("---------------------");
		        System.out.println("Fruit Name: " + fruit);
		        System.out.println("Count: " + newNumFruit);
		    }
		}catch(NumberFormatException e){
		    System.out.println("- Invalid Amount! -");
		}
		
		
	}
}