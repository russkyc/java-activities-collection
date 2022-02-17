package camo.act2;

//Package imports
import java.util.Scanner;

public class ElapsedToSeconds {

    public static void main(String[] args) {

        Scanner usrInput = new Scanner(System.in);                                //Assign scanner
        System.out.print("Please enter time elapsed in this format(HH:mm:ss): "); //Ask user for elapsed seconds input
        String elapsedTime = usrInput.nextLine();                                 //Init elapsed time as next input string
        usrInput.close();                                                         //Close Scanner to prevent memory leaks

        String[] elapsedTimeArray = elapsedTime.split(":"); //Split Hour, Minute, Second to array from elapsed time

        //Check if user input splits to 3 strings
        if(elapsedTimeArray.length == 3){

            if(Integer.parseInt(elapsedTimeArray[1]) > 60) System.out.println("Minute cannot be greater than 60");       //Respond if minute input is greater than 60
            else if(Integer.parseInt(elapsedTimeArray[2]) > 60) System.out.println("Seconds cannot be greater than 60"); //Respond if seconds input is greater than 60

            //If input has valid Minute and Seconds value
            else {

                //Sum all operations from array items as elapsed seconds
                int elapsedSeconds = Integer.parseInt(elapsedTimeArray[0]) * 3600 + ((Integer.parseInt(elapsedTimeArray[1]) % 3600) * 60) + Integer.parseInt(elapsedTimeArray[2]);
                System.out.printf("%s is equivalent to %d seconds",String.valueOf(elapsedTime), elapsedSeconds);

            }

        }

        //If user input does not split into 3 strings
        else System.out.println("Invalid elapsed time, please follow this format HH:mm:ss.");

    }
}
