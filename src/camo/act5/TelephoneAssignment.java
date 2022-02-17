package camo.act5;

//Package imports
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class TelephoneAssignment {

    public static void main(String[] args) {

        Scanner usrInput = new Scanner(System.in);            //Assign scanner
        System.out.print("Please enter your Phone number: "); //Ask user to input number
        String acronym = usrInput.nextLine().toUpperCase();   //Get acronym as next user input and change case to uppercase
        usrInput.close();                                     //Close Scanner to prevent memory leaks

        //Call build telephone number method if input string matches alphabetical regex or '-', else invalidate.
        if(acronym.matches("^[a-zA-Z-]*$")) System.out.printf("Call %s at %s",acronym,buildTelephoneNumber(acronym));
        else System.out.println("Invalid Input.");

    }

    //Generate number based on acronym string
    public static String buildTelephoneNumber(String acronym){

        List<String> num2 = Arrays.asList("A", "B", "C");       //Place A,B,C in num2 list
        List<String> num3 = Arrays.asList("D", "E", "F");       //Place D,E,F in num3 list
        List<String> num4 = Arrays.asList("G", "H", "I");       //Place G,H,I in num4 list
        List<String> num5 = Arrays.asList("J", "K", "L");       //Place J,K,L in num5 list
        List<String> num6 = Arrays.asList("M", "N", "O");       //Place M,N,O in num6 list
        List<String> num7 = Arrays.asList("P", "Q", "R", "S");  //Place P,Q,R,S in num7 list
        List<String> num8 = Arrays.asList("T", "U", "V");       //Place T,U,V in num8 list
        List<String> num9 = Arrays.asList("W", "X", "Y", "Z");  //Place W,X,Y,Z in num9 list

        StringBuilder newNumber = new StringBuilder(); //Init string builder for generated number
        char[] charList = acronym.toCharArray();       //Convert acronym string into character array

        //iterate through all characters in char list
        for(char letter : charList){

            //Check if character is alphabetic, if so continue to inner commands
            if(Character.isAlphabetic(letter)){

                if(num2.contains(String.valueOf(letter))) newNumber.append(2);      //Append numerical 2 if character exists in num2 list
                else if(num3.contains(String.valueOf(letter))) newNumber.append(3); //Append numerical 3 if character exists in num3 list
                else if(num4.contains(String.valueOf(letter))) newNumber.append(4); //Append numerical 4 if character exists in num4 list
                else if(num5.contains(String.valueOf(letter))) newNumber.append(5); //Append numerical 5 if character exists in num5 list
                else if(num6.contains(String.valueOf(letter))) newNumber.append(6); //Append numerical 6 if character exists in num6 list
                else if(num7.contains(String.valueOf(letter))) newNumber.append(7); //Append numerical 7 if character exists in num7 list
                else if(num8.contains(String.valueOf(letter))) newNumber.append(8); //Append numerical 8 if character exists in num8 list
                else if(num9.contains(String.valueOf(letter))) newNumber.append(9); //Append numerical 9 if character exists in num9 list
            }

            else newNumber.append(letter); //If character is not alphabetic append original character to generated number

        }

        return newNumber.toString(); //return built string as new number
    }
}
