import java.util.*;
/*
Anisa Walji
This program is about...

First ask user for initial investment of years, and interest rate in %, increment of investment per year (scanner)
print headings for your method
for the number years
    Method to calculate the interest (AmountInvested*interestRate/
Amount = amount + interest + increment
print table
 */

public class InterestCalculation_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What was your initial investment? $");
        double amt = scan.nextDouble();
        System.out.print("How many years will you have the investment? ");
        int numYears = scan.nextInt();
        System.out.print("What is the interest rate in %");
        double rate = scan.nextDouble();
        System.out.print("How much money do you put in each year? ");
        int MEY = scan.nextInt();

        System.out.println("Year  Amount  New Deposit  Interest   New Balance");
        System.out.println("------------------------------------------------------");
        for (int year = 1; year <= numYears; year++) {
            double interest = calculateInterest(amt, rate);
            System.out.printf("%d\t %.2f\t %d\t\t %.2f\t\t %.2f \n", year, amt, MEY, interest, (amt+ interest));
            amt = amt + interest + MEY;

        }
    }
    public static double calculateInterest(double amt, double intRate) {
        amt = amt * intRate / 100;
        return amt;
    }
}

