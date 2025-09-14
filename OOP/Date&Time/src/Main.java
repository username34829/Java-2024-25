import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        LocalDate date1 = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        Instant instant = Instant.now(); //UTC Time

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E d | HH:mm");
        String dtf = dateTime.format(formatter);

        System.out.println(dtf);

        LocalDate date2 = LocalDate.of(2025, 12, 25);
        //LocalDate dateNow = LocalDate.of(2025, 12, 25);

        if(date2.isEqual(date1)){
            System.out.println("It's your birthday! Happy Birth Day!");
        }
        else{
            System.out.println("It's not your birthday yet! The time is: " + dateTime);
        }


    }
}
