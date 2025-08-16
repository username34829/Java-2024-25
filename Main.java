import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        String name = new String[2];
        Scanner sc = new Scanner(System.in);
        
        println("Whats your name? >>");
        String name[] = sc.nextLine();
        
        println("Your name is " + name + name);
    }
    
    public static void println(String s ) {
        System.out.println(s);
    }
    
}