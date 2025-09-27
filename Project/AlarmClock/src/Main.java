import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = null;
        String inputAlarmTime;
        String filePath = "Claim To Fame - The Grey Room _ Clark Sims.wav";

        while(time == null){
            try{
                System.out.print("Set an alarm (HH:MM:SS): ");
                inputAlarmTime = scanner.nextLine();

                time = LocalTime.parse(inputAlarmTime, formatter);
            }catch(DateTimeParseException e){
                System.out.println("Invalid Input! Enter the correct format (HH:MM:SS)");
            }
        }

        AlarmClock alarmClock = new AlarmClock(time, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
