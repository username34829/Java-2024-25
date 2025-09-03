import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter anything: ");
            int num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Somethings Wrong");
        }
        finally {
            scanner.close();
        }


    }
}
