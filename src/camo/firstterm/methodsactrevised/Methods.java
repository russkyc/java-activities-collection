package camo.firstterm.methodsactrevised;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();

        System.out.println("The word has " + numOfVowels(word) + " vowels.");

        System.out.print("Enter a letter: ");
        char letter = input.next().toLowerCase().charAt(0);

        System.out.println(isVowel(letter));

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        printSquareRoot(number);
    }

    public static boolean isVowel(char c){

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int numOfVowels(String s){

        int vowelCount = 0;

        char[] letters = s.toCharArray();

        for (char c : letters){
            if(isVowel(c)) vowelCount++;
        }

        return vowelCount;
    }

    public static void printSquareRoot(int n){

        double squareRoot = Math.sqrt(n);
        System.out.println("The square root is: " + squareRoot);

    }

}
