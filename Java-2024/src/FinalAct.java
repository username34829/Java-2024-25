/*
    * Name: Joshan, Lucmayan A.
    * Course/Year: DIT first year
    * Subject: Computer Programming
    * Date: Sat, Nov 15 2024
    * File Name: FinalAct.java
*/
import java.util.Scanner;
public class FinalAct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Test test = new Test(sc);
            test.validateAge();
            test.multiplicationTable();
            test.basicInfo();
            test.christmasTree();
        } catch (Exception e) {
            soutln("Error: " + e.getMessage());
        }
    }

    public static void sout(String x) {
        System.out.print(x);
    }

    public static void soutln(String x) {
        System.out.println(x);
    }

    public static String scStr(Scanner sc) {
        return sc.nextLine();
    }

    public static int scInt(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int result = sc.nextInt();
                sc.nextLine();
                return result;
            } else {
                soutln("Only Number, Try again.");
                sout("- > ");
                sc.next();
            }
        }
    }
}

class Test {
    private int age;
    private int number;
    private String firstName;
    private String lastName;
    private Scanner sc;

    public Test(Scanner sc) {
        this.sc = sc;
    }

    public void validateAge() {
            FinalAct.sout("Enter your age: ");
            age = FinalAct.scInt(sc);
            if (age > 0 && age < 18) {
                FinalAct.soutln("You are not Legal Age.");
            } else {
                FinalAct.soutln("You are Legal Age.");
            }
    }

    public void multiplicationTable() {
        FinalAct.sout("Enter a number: ");
        number = FinalAct.scInt(sc);
        FinalAct.soutln("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            FinalAct.soutln(number + " x " + i + " = " + (number * i));
        }
    }

    public void basicInfo() {
        FinalAct.sout("Enter your first name: ");
        firstName = FinalAct.scStr(sc);
        FinalAct.sout("Enter your last name: ");
        lastName = FinalAct.scStr(sc);
        FinalAct.soutln("Basic Info: " + firstName + " " + lastName + ", Age: " + age);
    }

    public void christmasTree() {
        int height = 7;
        String decoration;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                FinalAct.sout(" ");
            }
            for (int j = 0; j <= i; j++) {
                decoration = Math.random() < 0.2 ? "o" : "*";
                FinalAct.sout(decoration + " ");
            }
            FinalAct.soutln("");
        }

        for (int i = 0; i < 2; i++) {
            FinalAct.sout(" ".repeat(6 - 1) + "| |" + "\n");
        }
    }
}
