import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("[Welcome to Birthday countdown!]");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Set count down: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int set = count;

            @Override
            public void run() {
                System.out.println(set);
                set--;
                if(set < 0){
                    System.out.printf("Happy birthday %s!", name);
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);

        scanner.close();

    }
}
