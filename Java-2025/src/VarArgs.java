import java.util.Scanner;
public class VarArgs {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String midName = scanner.nextLine();

        System.out.println(fullName(lastName, firstName, midName));
    }
    static String fullName(String... fullName){

        if(fullName.length == 0){
            return null;
        }

        String format_lastName = fullName[0].substring(0, 1).toUpperCase();
        String format_lastName2 = fullName[0].substring(1).toLowerCase();

        String lastName = format_lastName + format_lastName2;

        String format_firstName = fullName[1].substring(0, 1).toUpperCase();
        String format_firstName2 = fullName[1].substring(1).toLowerCase();

        String firstName = format_firstName + format_firstName2;

        String format_midName = fullName[2].substring(0, 1).toUpperCase();
        String format_midName2 = fullName[2].substring(1).toLowerCase();

        String midName = format_midName + format_midName2;

        return lastName + " " + firstName + " " + midName;



    }
}
