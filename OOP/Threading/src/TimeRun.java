public class TimeRun implements Runnable{

    @Override
    public void run(){
        for(int i = 1; i <= 3; i++){

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread is interrupted");
            }

            if(i == 3){
                System.out.println("Times up!");
            }

            if(i == 3){
                System.out.println("BOOOOOOOOOMMMMM!!!!");
                System.out.println("The bomb exploded! You're died!");
                System.exit(0);
            }

        }
    }
}
