package basicCorePrograms;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        char character;
        Scanner scaner = new Scanner(System.in);
        character =scaner.next().charAt(0);
        scaner.close();

        if (character =='a' || character =='A' || character =='e' || character =='E' || character =='i' ||
                character =='I' || character =='o' || character =='O' || character =='u' || character =='U')
        {
            System.out.println(character +" is Vowel");
        }
        else {
            System.out.println(character +" is Consonant");
        }
    }
}
