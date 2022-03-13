package basicCorePrograms;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int power;
        System.out.println("Enter the value ");
        power = number.nextInt();
        number.close();

        if (power < 31) {
            for (int i=0; i <= power; i++)
                System.out.println("Power of given number is :" + (int) Math.pow(2, i));
        }
        else {
            System.out.println(" enter the number");
        }
    }
}
