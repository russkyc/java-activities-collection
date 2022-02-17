package camo.act8;

//Package imports
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner usrInput = new Scanner(System.in); //Assign scanner
        Random numGen = new Random();              //Assign random
        boolean isPlaying = true;                  //Init condition for game loop
        boolean isTrying = true;                   //Init condition for input loop

        //Game loop while condition isPlaying is true.
        while (isPlaying){

            int tries = 0;                                                                              //Init number of tries
            int generatedNum = numGen.nextInt(1,100);                                      //Init guessNum as generated random number from 1-100
            System.out.print("Random number between 1-100 generated.\nPlease enter your best guess: "); //Ask user to input guess number


            //Guessing loop while condition isTrying is true.
            while (isTrying){

                int guessedNum = usrInput.nextInt();                                                                              //Get user guess from next Integer input
                if (guessedNum > generatedNum && guessedNum - generatedNum > 30) System.out.print("A bit far, lower: ");          //Response if guess is 30 more than positions above number
                else if (guessedNum > generatedNum && guessedNum - generatedNum < 10) System.out.print("Almost there, lower: ");  //Response if guess is within 10 positions above number
                else if (guessedNum < generatedNum && generatedNum - guessedNum > 30) System.out.print("A bit far, higher: ");    //Response if guess is more than 30 positions below number
                else if (guessedNum < generatedNum && generatedNum - guessedNum < 10) System.out.print("Almost there, higher: "); //Response if guess is within 10 positions below number
                else isTrying = false;                                                                                            //if guess is equal to number isTrying is set to false, breaking guessing loop.

                tries++; //Increment tries each loop
            }

            System.out.printf("You got it after %d tries!\nWould you like to play again?(Y/N): ", tries); //After break from loop(correct guess), print number of tries
            char usrResponse = usrInput.next().charAt(0);                                                       //Get game continue response from next input

            if(String.valueOf(usrResponse).equalsIgnoreCase("y")) isTrying = true;  //if reply is yes(y) reset condition to restart guessing loop
            else isPlaying = false;                                                             //If response is other than y, isPlaying is set to false, breaking main game loop
        }

        usrInput.close(); //Close Scanner to prevent memory leaks
        System.out.println("Thanks for playing!");

    }
}
