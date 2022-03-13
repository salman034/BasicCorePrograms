package basicCorePrograms;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Number;
        System.out.println("Enter a number");
        Number = input.nextInt();
        input.close();

        if (Number % 2 == 0 )
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }
}
