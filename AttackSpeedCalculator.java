import java.util.Scanner;

public class AttackSpeedCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic attack speed: ");
        double bas = sc.nextDouble();

        System.out.print("Enter the bonus attack speed (%): ");
        int bonus = sc.nextInt();

        double x = bonus / 100.0;

        System.out.print("Enter the level: ");
        int lvl = sc.nextInt();
        
        double currentAttackSpeed = bas * (1 + (x * (lvl - 1))); 

        System.out.println("The character's current attack speed is: " + currentAttackSpeed);

        sc.close(); 
    }
}
