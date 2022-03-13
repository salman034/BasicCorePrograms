package basicCorePrograms;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int Number1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int Number2 = scanner.nextInt();
        scanner.close();

        System.out.println("Before Swapping numbers are: ");
        System.out.println("The first number is : " + Number1);
        System.out.println("The second number is : " + Number2);

        int temp = Number1;
        Number1 = Number2;
        Number2 = temp;

        System.out.println("After Swapping numbers are: ");
        System.out.println("The first number is : " + Number1);
        System.out.println("The second number is : " + Number2);

    }
}
