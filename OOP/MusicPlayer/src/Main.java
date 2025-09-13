import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        String filePath = "/home/joshan/Downloads/Claim To Fame - The Grey Room _ Clark Sims.wav";
        File file = new File(filePath);
        Scanner scanner = new Scanner(System.in);



        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            int input = 0;

            while(input != 4){
                System.out.println("Welcome to Audio Play Program");
                System.out.println("1. Play");
                System.out.println("2. Stop");
                System.out.println("3. Reset");
                System.out.println("4. Quit");
                System.out.print("- ");
                input = scanner.nextInt();

                switch (input){
                    case 1 -> clip.start();
                    case 2 -> clip.stop();
                    case 3 -> clip.setMicrosecondPosition(0);
                    case 4 -> clip.close();
                    default -> System.out.println("Invalid Input");
                }
            }

        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }catch (IOException e){
            System.out.println("Something went wrong!");
        }catch(UnsupportedAudioFileException e){
            System.out.println("File is unsupported");
        }catch(LineUnavailableException e){
            System.out.println("Couldn't find file resources");
        }
        finally{
            System.out.println("Thank you for using this program!");
            scanner.close();
        }


    }
}