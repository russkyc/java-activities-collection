package camo.firstterm.act1;

//Package imports
import java.util.Scanner;

public class SecondsToElapsed {

    public static void main(String[] args) {

        Scanner usrInput = new Scanner(System.in);                  //Assign scanner
        System.out.print("Please enter time elapsed in seconds: "); //Ask user for elapsed seconds input
        int secondsElapsed = usrInput.nextInt();                    //Init elapsed from next integer input
        usrInput.close();                                           //Close Scanner to prevent memory leaks

        //Format operation values to string                  //Calculate Hours         //Calculate Minutes          //Calculate Seconds
        String timeElapsed = String.format("%02d:%02d:%02d", secondsElapsed / 3600, (secondsElapsed % 3600) / 60, secondsElapsed % 60);
        System.out.printf("%d seconds is equivalent to %s",secondsElapsed,timeElapsed);
    }
}
