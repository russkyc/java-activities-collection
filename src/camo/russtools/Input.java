package camo.russtools;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {

    private final Scanner newScan = new Scanner(System.in);

    public int getInt(String message){
        System.out.printf("\n%s: ", message);
        try{
            return Integer.parseInt(newScan.next().trim());
        } catch (NoSuchElementException | NumberFormatException e){

            return 0;
        }
    }

    public double getDouble(String message){
        System.out.printf("\n%s: ", message);
        try{
            return Double.parseDouble(newScan.next().trim());
        } catch (NoSuchElementException | NumberFormatException e){
            return 0;
        }
    }

    public float getFloat(String message){
        System.out.printf("\n%s: ", message);
        try{
            return (float)Double.parseDouble(newScan.next().trim());
        } catch (NoSuchElementException | NumberFormatException e){

            return 0;
        }
    }

    public char getChar(String message){
        System.out.printf("\n%s: ", message);
        try{
            return newScan.next().trim().charAt(0);
        } catch (NoSuchElementException e){

            return ' ';
        }
    }

    public char getChar(String message, int index){
        System.out.printf("\n%s: ", message);
        try{
            return newScan.next().trim().charAt(index);
        } catch (NoSuchElementException e){
            return ' ';
        }
    }

    public String getString(String message){
        System.out.printf("\n%s: ", message);
        try{
            String tempString = newScan.next().trim();
            newScan.nextLine();
            return tempString;
        } catch (NoSuchElementException e){
            System.out.print("Answer cannot be blank.");
            return "";
        }
    }

    public String getLine(String message){
        System.out.printf("\n%s: ", message);
        try{
            return newScan.nextLine().trim();
        } catch (NoSuchElementException e){
            return "";
        }
    }

    public String[] getStringCollection(String message, String regex){
        System.out.printf("\n%s: ", message);

        try{
            return newScan.nextLine().trim().split(regex);
        } catch (NoSuchElementException e){
            return null;
        }
    }

    public void Close(){
        this.newScan.close();
    }

}
