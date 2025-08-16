public class Main {
	public static void main(String[] args) {
		// break (STOP)
		// continue (SKIP)
		
		for(int i = 0; i < 10; i++){
		    
		    if (i == 5){
		        System.out.print("\" \" ");
		        break;
		    }
		    
		    System.out.print(i + " ");
		}
		
		System.out.println(" ");
		
		for(int i = 0; i < 10; i++){
		    
		    if (i == 5){
		        System.out.print("\" \" ");
		        continue;
		    }
		    
		    System.out.print(i + " ");
		} 
		    
		    
	}
	
}