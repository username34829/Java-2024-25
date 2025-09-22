import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("- ");
        String input = scanner.nextLine().toUpperCase();

        try{
            Tool tool = Tool.valueOf(input);

            if(tool.equals(Tool.PAPER) | tool.equals(Tool.PEN) | tool.equals(Tool.PENCIL)){
                System.out.println(input + " Its a Writing Tool");
            }

        }catch(IllegalArgumentException e){
            System.out.println("Not on the enum class");
        }



    }
}