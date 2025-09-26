import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Thread thread1 = new Thread(new TimeRun("A"));
        Thread thread2 = new Thread(new TimeRun("B"));

        System.out.println("Start!");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            System.out.println("Thread was interrupted!");
        }

        System.out.println("End!");

    }
}