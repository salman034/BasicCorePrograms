package basicCorePrograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int Tail = 0, Head = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number :");
        int count = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < count; i++) {
            if (Math.random() < 0.5) {
                Tail++;
                System.out.println("Head");
            }
            else {
                Head++;
                System.out.println("Head");
            }
            int headflip = (100 * Head) / count;
            int tailflip = (100 * Tail) / count;
            System.out.println("Percentage of head is :" + headflip);
            System.out.println("Percentage of tail is : " + tailflip);
        }
    }
}
