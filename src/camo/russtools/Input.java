package camo.russtools;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {

    public int getInt(String message){
        Scanner newScan = new Scanner(System.in);
        System.out.printf("\n%s: ", message);
        try{
            int tempNum = Integer.parseInt(newScan.next().trim());
            newScan.close();
            return tempNum;
        } catch (NoSuchElementException | NumberFormatException e){
            newScan.close();
            return 0;
        }
    }

    public double getDouble(String message){
        Scanner newScan = new Scanner(System.in);
        System.out.printf("\n%s: ", message);
        try{
            double tempNum = Double.parseDouble(newScan.next().trim());
            newScan.close();
            return tempNum;
        } catch (NoSuchElementException | NumberFormatException e){
            newScan.close();
            return 0;
        }
    }

    public float getFloat(String message){
        Scanner newScan = new Scanner(System.in);
        System.out.printf("\n%s: ", message);
        try{
            float tempNum = (float)Double.parseDouble(newScan.next().trim());
            newScan.close();
            return tempNum;
        } catch (NoSuchElementException | NumberFormatException e){
            newScan.close();
            return 0;
        }
    }

    public char getChar(String message){
        Scanner newScan = new Scanner(System.in);
        System.out.printf("\n%s: ", message);
        try{
            char tempString = newScan.next().trim().charAt(0);
            newScan.close();
            return tempString;
        } catch (NoSuchElementException e){
            newScan.close();
            return ' ';
        }
    }

    public char getChar(String message, int index){
        Scanner newScan = new Scanner(System.in);
        System.out.printf("\n%s: ", message);
        try{
            char tempString = newScan.next().trim().charAt(index);
            newScan.close();
            return tempString;
        } catch (NoSuchElementException e){
            newScan.close();
            return ' ';
        }
    }

    public String getString(String message){
        Scanner newScan = new Scanner(System.in);
        System.out.printf("\n%s: ", message);
        try{
            String tempString = newScan.next().trim();
            newScan.close();
            return tempString;
        } catch (NoSuchElementException e){
            newScan.close();
            return "";
        }
    }

    public String getLine(String message){
        Scanner newScan = new Scanner(System.in);
        System.out.printf("\n%s: ", message);
        try{
            String tempString = newScan.nextLine().trim();
            newScan.close();
            return tempString;
        } catch (NoSuchElementException e){
            newScan.close();
            return "";
        }
    }

    public String[] getStringCollection(String message, String regex){
        Scanner newScan = new Scanner(System.in);
        System.out.printf("\n%s: ", message);

        try{
            String[] tempString = newScan.nextLine().trim().split(regex);
            newScan.close();
            return tempString;
        } catch (NoSuchElementException e){
            newScan.close();
            return null;
        }
    }

}
