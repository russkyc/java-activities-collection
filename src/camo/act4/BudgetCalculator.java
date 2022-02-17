package camo.act4;

public class BudgetCalculator {

    static double cashOnHand = 0;            //Init cash on hand
    static final double HOURLY_RATE = 15.50; //Init hourly rate
    static final double TAX_BRACKET = 0.14;  //Init Tax Bracket percentage

    static final int WORKING_HOURS = 10; //Init work hours
    static final int WORKING_DAYS = 5;   //Init work days
    static final int WORKING_WEEKS = 5;  //Init work weeks

    static final double CLOTHES_ACCESSORIES_DEDUCTION = 0.10;  //Init clothes and acc percentage
    static final double SCHOOL_SUPPLIES_DEDUCTION = 0.01;      //Init school supplies percentage
    static final double SAVINGS_BONDS_DEDUCTION = 0.25;        //Init savings bonds percentage
    static final double SAVINGS_BONDS_ADDITION = 0.50;         //Init additional cost per bonds

    public static void main(String[] args) {

        getGrossAndNetPay();     //Call get gross and net pay method
        getClothesAndAccCost();  //Call get cloths and accessories method
        getSchoolSuppliesCost(); //Call get school supplies cost method
        getSavingsBondsCost();   //Call get savings bonds cost method

        System.out.printf("You are now left with $%.2f\n",cashOnHand);
    }

    //Compute Gross and Net Pay
    private static void getGrossAndNetPay(){

        int totalWorkHours = WORKING_HOURS * WORKING_DAYS * WORKING_WEEKS;  //Compute total hours as hours per day * days * week
        double totalGrossPay = HOURLY_RATE * totalWorkHours;                //Compute gross salary as hourly rate * total hours
        double totalNetPay = totalGrossPay - (totalGrossPay * TAX_BRACKET); //Compute net salary as gross salary - bracket deduction total
        cashOnHand = totalNetPay;                                           //set net pay as cash on hand with total salary after deductions

        System.out.printf("Your gross pay is: $%.2f\n",totalGrossPay);
        System.out.printf("Your net pay is: $%.2f\n",totalNetPay);
    }

    //Compute Clothes and Accessories Costing
    private static void getClothesAndAccCost(){

        double totalCost = cashOnHand * CLOTHES_ACCESSORIES_DEDUCTION; //Compute total cost as percentage value from cash on hand
        cashOnHand -= totalCost;                                       //Deduct clothes and accessories cost from cash on hand

        System.out.printf("Your spending on clothes and other accessories is: $%.2f\n",totalCost);
    }

    //Compute School Supplies Costing
    private static void getSchoolSuppliesCost(){

        double totalCost = cashOnHand * SCHOOL_SUPPLIES_DEDUCTION; //Compute total cost as percentage value from cash on hand
        cashOnHand -= totalCost;                                   //Deduct school supplies cost from cash on hand

        System.out.printf("Your spending on school supplies is: $%.2f\n",totalCost);
    }

    //Compute Investments Costing
    private static void getSavingsBondsCost(){

        double totalCost = cashOnHand * SAVINGS_BONDS_DEDUCTION;    //Compute total cost as percentage value from cash on hand
        double totalAdditions = totalCost * SAVINGS_BONDS_ADDITION; //Compute total additions as dollar cost * cost per additional bonds
        cashOnHand -= totalCost;                                    //Deduct investment cost from cash on hand.

        System.out.printf("Your spending on savings bonds is: $%.2f\n",totalCost);
        System.out.printf("Your parents' spending on additional bonds is: $%.2f\n",totalAdditions);
    }
}
