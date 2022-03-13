package basicCorePrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three Numbers");

        firstNumber = input.nextInt();
        secondNumber = input.nextInt();
        thirdNumber = input.nextInt();
        input.close();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber))
        {
            System.out.println("The Largest Number is " + firstNumber);
        }
        else if (secondNumber > thirdNumber)
        {
            System.out.println("The Largest Number is " + secondNumber);
        }
        else
        {
            System.out.println("The Largest Number is " + thirdNumber);
        }
    }
}
