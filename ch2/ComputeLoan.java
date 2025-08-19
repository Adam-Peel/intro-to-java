import java.util.Scanner;

public class ComputeLoan {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Enter the total loan amount in whole pounds");
    int loan = input.nextInt();

    System.out.println("Enter the annual interest rate");
    double interestRateAnnual = input.nextDouble();

    double interestRateMonthly = interestRateAnnual / 1200;

    System.out.println("Enter the number of years for the loan");
    int years = input.nextInt();

    double monthlyPayment = ((loan * interestRateMonthly) / (1 - (1 / Math.pow(1 + interestRateMonthly, years * 12))));

    double totalPay = monthlyPayment * years * 12;

    System.out.println("The monthly payment is £" + (int)(monthlyPayment * 100) / 100);
    System.out.println("The total payment is £" + (int)(totalPay * 100) / 100);

  } 
}