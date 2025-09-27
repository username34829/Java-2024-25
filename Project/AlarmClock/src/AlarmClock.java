import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime time;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime time, String filePath, Scanner scanner){
        this.time = time;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run(){

        while(LocalTime.now().isBefore(time)){

            try{
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            }catch (InterruptedException e){
                System.out.println("Thread was Interrupted!");
            }
        }
        System.out.println("\n*ALARM NOISES*");
        playSound(filePath);

    }

    private void playSound(String filePath){

        File audioFile = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press *Enter key* to stop: ");
            scanner.nextLine();
            clip.stop();

            scanner.close();

        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }catch(LineUnavailableException e){
            System.out.println("Audio is Unavailable");
        } catch (IOException e) {
            System.out.println("Error reading Audio file");
        }

    }
}
