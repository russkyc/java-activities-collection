package camo.firstterm.labexer2;

//Imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabExer2 {

    static List<item> purchased = new ArrayList<>();     //Init global list of item objects
    static Scanner usrInput = new Scanner(System.in);    //Init Scanner

    public static void main(String[] args) {

        do {                                                              //Infinite loop
            readInput();                                                  //Ask Items to purchase
            System.out.print("Buy other items?(y/n): ");
        } while (usrInput.nextLine().toLowerCase().charAt(0) != 'n');     //Repeat loop while user answers y

        writeInput();   //Print Purchased Items

    }

    private static void readInput(){

        item newItem = new item();      //Create new item instance

        System.out.print("Please enter the name of the item you are purchasing: ");     //Ask for user input
        newItem.setItemName(usrInput.nextLine());                                       //Set item name of item instance from next line

        System.out.print("Please enter the Quantity and Price separated by a space: ");         //Ask fir user input
        String[] itemInfo = usrInput.nextLine().trim().split(" ");                        //Populate new array using split user input
        newItem.setTotalCost(Integer.parseInt(itemInfo[0]),Double.parseDouble(itemInfo[1]));    //Set total cost of item instance using array values at 0 and 1

        purchased.add(newItem);     //Add item instance to purchased object arraylist
    }

    private static void writeInput(){

        double amountDue = 0;      //Init amount due

        System.out.println("\nPurchased the following items:");

        for(item n : purchased){    //loop through each item object in purchased arraylist

            //For each item object in purchased, print quantity, item name, item price, and unit cost
            System.out.printf("(%d)%s(s) at P%.2f each for P%.2f\n",n.getItemQuantity(), n.getItemName(), n.getItemPrice(), n.getTotalCost());
            amountDue += n.getTotalCost();  //Add unit cost to total amount due

        }
        System.out.printf("\nAmount Due: P%.2f", amountDue);    //Print amount due
    }

}

class item{     //Item class/Object

    private String itemName;
    private double itemPrice;
    private double amountDue;
    private int itemQuantity;

    public void setItemName(String newItemName){ itemName = newItemName; }
    public void setTotalCost(int quantity, double price){ itemPrice = price; itemQuantity = quantity; amountDue = itemPrice * itemQuantity; }

    public String getItemName(){ return itemName; }
    public double getItemPrice(){ return itemPrice; }
    public double getTotalCost(){ return amountDue; }
    public int getItemQuantity(){ return itemQuantity; }

}
