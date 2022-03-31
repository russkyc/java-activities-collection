package camo.firstterm.methodsactivity;

import java.util.Arrays;    //Imports
import java.util.Scanner;   //Imports

public class Methods {

    public static void main(String[] args) {

        Scanner usrInput = new Scanner(System.in);      //instantiate Scanner

        System.out.print("Please enter any word: ");    //Ask user for word input
        String word = usrInput.next();                  //Get next input as word

        //Print values from methods                                                          //Number of Vowels              //Check first letter if vowel or consonant
        System.out.printf("%s has %d vowels and starts with a %s.\n",word ,numOfVowels(word.toLowerCase()),isVowel(word.toLowerCase().charAt(0)) ? "vowel":"consonant");

        System.out.print("Enter a number, I'll find the square root: ");    //Ask user for number input
        printSquareRoot(usrInput.nextInt());                                //Calls method to print square root
    }

    public static boolean isVowel(char c){              //Checks if given char is a 'vowel'. Used in line 16
        Character[] vowels = {'a','e','i','o','u'};     //Array of vowels as reference
        return Arrays.asList(vowels).contains(c);       //returns true if array of vowels contains given char
    }

    public static int numOfVowels(String s){                         //Counts 'vowels' from given string. Used in line 16
        int vowelCount = 0;                                          //Init vowel count as 0
        for (char c : s.toCharArray()) if(isVowel(c)) vowelCount++;  //Loop through all chars in given string, if char is a vowel then increment vowel count.
        return vowelCount;                                           //Returns vowelCount as number of vowels in given string
    }

    public static void printSquareRoot(int n){                                  //Prints square root of given number. Used in line 19
        System.out.printf("The square root of %d is %.2f.",n,Math.sqrt(n));     //Square root value from Math.sqrt method is rounded at 2 decimal places then printed.
    }

}
