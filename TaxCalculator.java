public class TaxCalculator {

    public static int calculateTax(int amount) {
        int tax = amount / 10;
        return tax; // method with the return type, pass the global copy.
    }

    public static void main(String[] args) {

        int salary = 10000;

        int finalTax = calculateTax(salary); // passing value to the method. ( local copy )
        System.out.println("your final tax: " + finalTax); 

    }
}
