package camo.firstterm.labexer1b;

//Imports
import java.util.Scanner;

public class LabExer1B {

    private static int num; //Init global number

    public static void main(String[] args) {

        Scanner ursInput = new Scanner(System.in);     //Init Scanner
        System.out.print("Please enter an integer: "); //Ask user to enter an integer
        num = ursInput.nextInt();                      //Get num from next integer input

        System.out.println(num + " plus 10 is: " + showNumberPlus10());
        System.out.println(num + " plus 100 is: " + showNumberPlus100());
        System.out.println(num + " plus 1000 is: " + showNumberPlus1000());

    }

    private static int showNumberPlus10(){ return num + 10; }      //Add 10 method
    private static int showNumberPlus100(){ return num + 100; }    //Add 100 method
    private static int showNumberPlus1000(){
        return num + 1000;
    } //Add 1000 method


}
