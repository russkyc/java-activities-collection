package camo.act3;

//Package imports
import java.util.Scanner;

public class MilkProduceManagement {

    static double litersProduced = 0;  //Init total liters produced
    static double cartonsProduced = 0; //Init total cartons produced

    static final double LITER_PER_CARTON = 3.78;  //Constant liters per carton
    static final double COST_PER_LITER = 0.38;    //Constant cost per liter
    static final double PROFIT_PER_CARTON = 0.27; //Constant profit per carton

    public static void main(String[] args) {

        Scanner usrInput = new Scanner(System.in);                        //Assign scanner
        System.out.print("Please enter total liters of milk produced: "); //Ask user for integer input
        litersProduced = usrInput.nextDouble();                           //Get liters from next user double input
        usrInput.close();                                                 //Close Scanner to prevent memory leaks

        getCartons(); //Call get carton count method
        getCost();    //Call get total cost method
        getProfits(); //Call get total profits method
    }

    //Compute cartons filled.
    private static void getCartons(){

        cartonsProduced = litersProduced / LITER_PER_CARTON; //Compute cartons produced as liters produced / constant liters per carton
        System.out.printf("Total Cartons Filled: %.2f\n",cartonsProduced);

    }

    //Compute cost
    private static void getCost(){

        System.out.printf("Total production costs: $%.2f\n",litersProduced * COST_PER_LITER); //Compute production costs as liters produced * constant cost per liter

    }

    //Compute formatting
    private static void getProfits(){

        System.out.printf("Total profits: $%.2f\n",cartonsProduced * PROFIT_PER_CARTON); //Compute profits as cartons produced * constant cost per carton

    }
}
