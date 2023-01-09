/*
Jack Cochran - 
*/
public class TipHelper{
    public static void main(String[] args){
        double tipPercentage = 0.15;
        double mealTotal = 20.17;
        int numberItemsOrdered = 3;
        String customerName = "Jacob";
        double totalTip = mealTotal * tipPercentage;
        double totalAmountPaid = mealTotal + totalTip;
        System.out.printf("The total tip was $%.2f!\n", totalTip);
        System.out.printf(customerName + " owes a total of $%.2f.\n", totalAmountPaid);
    }
}