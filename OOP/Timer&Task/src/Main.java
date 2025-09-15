import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int stop = 10;

            @Override
            public void run() {
                System.out.println("Alarm is ringing...");
                stop--;

                if(stop == 0){
                    System.out.println("[System: Alarm stop]");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);
    }
}
