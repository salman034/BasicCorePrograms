package basicCorePrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter four digit number :");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        sc.close();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)) {
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("It is not a Leap Year");
        }
    }
}
