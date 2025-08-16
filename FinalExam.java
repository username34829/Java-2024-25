/*
    * Name: Joshan, Lucmayan A.
    * Course/Year: DIT first year
    * Subject: Computer Programming
    * Date: Sat, Dec 7 2024
    * File Name: FinalExam.java
*/
import java.util.Scanner;
public class FinalExam {

    public static int maxNumber(int[] n) {
        int max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }

    public static double[] lowToHighest(double[] n) {
        double[] x = n.clone();
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    double temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integers: ");
        String x = sc.nextLine();
        String[] y = x.split(" ");
        int[] numx = new int[y.length];
        for (int i = 0; i < y.length; i++) {
            numx[i] = Integer.parseInt(y[i]);
        }
        System.out.println("The maximum number is: " + maxNumber(numx));

        System.out.print("\nEnter doubles: ");
        String xx = sc.nextLine();
        String[] yy = xx.split(" ");
        double[] numxx = new double[yy.length];
        for (int i = 0; i < yy.length; i++) {
            numxx[i] = Double.parseDouble(yy[i]);
        }

        double[] z = lowToHighest(numxx);
        System.out.print("Low to highest: ");
        for (double num : z) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
