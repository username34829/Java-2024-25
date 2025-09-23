import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        TimeRun timeRun = new TimeRun();
        Thread thread = new Thread(timeRun);
        thread.setDaemon(true);
        thread.start();

        System.out.println("Bomb will explode in 3 second");
        System.out.print("Enter \"STOP\" to stop: ");
        String stop = scanner.nextLine().toUpperCase();

        if(stop.equals("STOP")){
            System.out.println("You stop the bomb");
            System.out.println("You are safe!");
        }
        else{
            System.out.println("!!WRONG ENTER!!");
            System.out.println("BOOOOOOOOOMMMMM!!!!");
            System.out.println("The bomb exploded! You're died!");
        }
    }
}