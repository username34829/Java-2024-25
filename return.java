import java.util.Scanner;
public class Main {
  public static void main(String[] args)
  {
  	Scanner sc = new Scanner(System.in);
  	
  	double price, discount, saving;
  	
   print("Enter cutoff price for discount >> ");
   price = sc.nextDouble();
   print("Enter Discount rate as a whole number >> ");
   discount = sc.nextDouble();
   
   saving = calsave(price, discount);
   
   println("\nSpecial this week on any service over " + price + "%" + 
           "\nDiscount of " + discount + "%" + 
           "\nThats a savings of at least $"+ saving);
  	
  }
  public static double calsave(double price, double discount)
  {
  	double saving;
  	saving = price * discount / 100;
  	return saving;
  }
  public static void println(String s)
  {
  	System.out.println(s);
  }
  public static void print(String s)
  {
  	System.out.print(s);
  }
}