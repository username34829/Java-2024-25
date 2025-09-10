import java.io.FileWriter;
import java.io.IOException;
public class Main{
    public static void main(String[] args){
        try(FileWriter f = new FileWriter("myfile")){
            f.write("Hi Joshan, This is not me");
            System.out.println("Successful written file!");
        }
        catch(IOException e){
            System.out.println("Something with wrong in the I/O File");
        }


    }
}
