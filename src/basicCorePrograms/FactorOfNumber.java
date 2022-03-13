package basicCorePrograms;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        int i, number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        number = scanner.nextInt();
        scanner.close();

        for (i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.println("The factor is :" + i);
        }
    }
}
