package basicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double i, number, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();
        sc.close();

        for (i = 1; i <= number; i++)
        {
            sum = sum + (double)1 / i;
        }
        System.out.println(" Harmonic value is :" + sum);
    }
}
