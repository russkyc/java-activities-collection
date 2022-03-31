package camo.firstterm.act7;

//Package imports
import java.util.Scanner;

public class ZodiacSignFinder {

    public static void main(String[] args) {

        Scanner usrInput = new Scanner(System.in);                                                //Assign scanner
        double[] ZODIAC_DATES = {1.19,2.18,3.21,4.19,5.20,6.20,7.22,8.22,9.22,10.22,11.21,12.21}; //Init zodiac range as decimals eg: 1.19 = January 19

        System.out.print("Please enter your birth month and date in this format(mm/dd): ");                            //Ask user to input birthdate
        double birthDate = Double.parseDouble(String.valueOf(usrInput.nextLine()).replace('/','.'));   //Get birthdate as parsed decimal from next string input
        String[] birthDateChecker = String.valueOf(birthDate).split("\\.",2);                              //Split Month and Date into array to check validity

        //If Month or Date is Invalid
        if(Integer.parseInt(birthDateChecker[0]) < 1 || Integer.parseInt(birthDateChecker[0]) > 12) System.out.printf("%s is not a valid month.\n",birthDateChecker[0]);
        else if(Integer.parseInt(birthDateChecker[1]) < 1 || Integer.parseInt(birthDateChecker[1]) > 31) System.out.printf("%s is not a valid day.\n",birthDateChecker[1]);

        //If Month and Date is Valid
        else{

            String zodiacSign = ""; //Init zodiacSign String

            if(birthDate < ZODIAC_DATES[0] || birthDate > ZODIAC_DATES[11]) zodiacSign = "Capricorn";       //If date is between December 22 - January 19
            else if(birthDate > ZODIAC_DATES[0] && birthDate <= ZODIAC_DATES[1]) zodiacSign = "Aquarius";   //If date is between January 19 - February 18
            else if(birthDate > ZODIAC_DATES[1] && birthDate <= ZODIAC_DATES[2]) zodiacSign = "Pisces";     //If date is between February 19 - March 21
            else if(birthDate > ZODIAC_DATES[2] && birthDate <= ZODIAC_DATES[3]) zodiacSign = "Aries";      //If date is between March 22 - April 19
            else if(birthDate > ZODIAC_DATES[3] && birthDate <= ZODIAC_DATES[4]) zodiacSign = "Taurus";     //If date is between April 20 - May 20
            else if(birthDate > ZODIAC_DATES[4] && birthDate <= ZODIAC_DATES[5]) zodiacSign = "Gemini";     //If date is between May 21 - June 20
            else if(birthDate > ZODIAC_DATES[5] && birthDate <= ZODIAC_DATES[6]) zodiacSign = "Cancer";     //If date is between June 21 - July 22
            else if(birthDate > ZODIAC_DATES[6] && birthDate <= ZODIAC_DATES[7]) zodiacSign = "Leo";        //If date is between July 23 - August 22
            else if(birthDate > ZODIAC_DATES[7] && birthDate <= ZODIAC_DATES[8]) zodiacSign = "Virgo";      //If date is between August 23 - September 22
            else if(birthDate > ZODIAC_DATES[8] && birthDate <= ZODIAC_DATES[9]) zodiacSign = "Libra";      //If date is between September 23 - October 22
            else if(birthDate > ZODIAC_DATES[9] && birthDate <= ZODIAC_DATES[10]) zodiacSign = "Scorpio";   //If date is between October 23 - November 21
            else if(birthDate > ZODIAC_DATES[10]) zodiacSign = "Sagittarius";                               //If date is between November 22 - December 21

            System.out.printf("Your zodiac sign is %s.",zodiacSign);
        }

    }

}
