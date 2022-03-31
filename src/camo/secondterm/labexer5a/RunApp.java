package camo.secondterm.labexer5a;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RunApp {
    public static void main(String[] args){

        Scanner usrInput = new Scanner(System.in);
        Random numGen = new Random();
        int numRange = 50;
        boolean isPlaying = true;
        boolean isTrying = true;

        while (isPlaying){

            int tries = 0;
            int generatedNum = numGen.nextInt(1,numRange);
            ReplaceOutputLine("Random number between 1-%d generated.".formatted(numRange),0);
            ReplaceOutputLine("Please enter your best guess: ",1000);

            do {

                String message = "";

                try {
                    int guessedNum = usrInput.nextInt();
                    if(guessedNum > numRange || guessedNum < 1) throw new IllegalArgumentException();
                    if (guessedNum > generatedNum && guessedNum - generatedNum > generatedNum / 2) message = "A bit far, lower: ";
                    else if (guessedNum > generatedNum && guessedNum - generatedNum < generatedNum / 4) message = "Almost there, lower: ";
                    else if (guessedNum < generatedNum && generatedNum - guessedNum > generatedNum / 2) message = "A bit far, higher: ";
                    else if (guessedNum < generatedNum && generatedNum - guessedNum < generatedNum / 4) message = "Almost there, higher: ";
                    else isTrying = false;
                } catch (InputMismatchException numeric){
                    message = "Input is not a valid number. try again: ";
                    usrInput.next();
                } catch (IllegalArgumentException range){
                    message = "Input is out of range. Enter a number between 1 & %d: ".formatted(numRange);
                }

                System.out.print(message);
                tries++;

            } while (isTrying);

            System.out.printf("You got it after %d tries!", tries);
            ReplaceOutputLine("Would you like to play again?(Y/N): ",1000);
            char usrResponse = usrInput.next().charAt(0);

            if(String.valueOf(usrResponse).equalsIgnoreCase("y")) isTrying = true;
            else isPlaying = false;
        }

        usrInput.close();
        ReplaceOutputLine("Thanks for playing!",200);
    }

    public static void ReplaceOutputLine(String newText, int delay){

        Thread t1 = new Thread(() ->{
            try {
                Thread.sleep(delay);
                System.out.printf("\r%s",newText);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
    }

}
