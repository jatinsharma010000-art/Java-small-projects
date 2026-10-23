import java.util.Scanner;

public class TheFreelancerInvoiceGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hourly rate: "); // ask the user to enter their hourly rate
        double hourlyRate = sc.nextDouble(); // used double data type better precision.

        System.out.print("Total hour worked: "); // ask the user to enter the total hour they worked
        int totalHoursWorked = sc.nextInt(); // used integer data types because time must be counted as the whole number

        double basePay = hourlyRate * totalHoursWorked;
        double tax = basePay * 15 / 100;
        double finalNetPay = basePay - tax;

        System.out.println("Your Base Pay: " + basePay);
        System.out.println("Tax: " + tax);
        System.out.println("Final Net Pay: " + finalNetPay);

        // printing all the detail as the invoice for the freelancer

        sc.close(); // Close the scanner object
    }
}
