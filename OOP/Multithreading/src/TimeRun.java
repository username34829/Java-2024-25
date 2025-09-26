public class TimeRun implements Runnable{

    private final String text;

    TimeRun(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 3; i++){

            try{
                Thread.sleep(1000);
                System.out.println(text);
            }catch (InterruptedException e){
                System.out.println("Thread is interrupted");
            }
        }
    }
}
