import java.util.Scanner;
public class CafeNet {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int time = 1;
		int coins = 0;
		
		do{
		    System.out.print("Drop 5 pesos: ");
		    coins = scanner.nextInt();
		    
		    if(coins < 5 || coins > 5){
		        System.out.println("Please drop 5pesos only.");
		        System.out.println("Try again!!");
		    }
		    
		}while(coins < 5  || coins > 5);
		
		
		if(coins == 5){
		    System.out.println("You have 20 minutes.");
		    for(int i = time; i <= 1200; i++){
		        System.out.println(i + " ");
		        try{
		        Thread.sleep(1000);
		        }catch(Exception e){
		            System.out.println("Error..");
		        }
		        if(i == 1200){
		            System.out.println("-> End");
		            System.out.println("Last second is " + i);
		        }
		    }
		}
		
		scanner.close();
		
	}
}