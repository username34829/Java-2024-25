import java.util.Scanner;
public class EXE06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("What time is it?: ");
        int time = scanner.nextInt();
        
        String status = (time <= 12) ? "AM" : "PM";
        
        System.out.println("its "+ status);
        */
        
        
        double num1;
        double num2;
        char operator;
        double result;
        
        System.out.print("Enter first number");
        num1 = scanner.nextDouble();
        
        System.out.println("Enter operator *, -, /, +");
        operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number");
        num2 = scanner.nextDouble();
        
        switch(operator){
            case '*' -> result = num1 * num2;
            case '-' -> result = num1 - num2;
            case '/' -> result = num1 / num2;
            case '+' -> result = num1 + num2;
        }
        System.out.println(result);
        
        
        
    }
    
}