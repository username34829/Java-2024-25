import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {

        String filePath = "/home/joshan/x file.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }catch (IOException e){
            System.out.println("Something went wrong!");
        }


    }
}