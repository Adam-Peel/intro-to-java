import java.util.Scanner;

public class Taxes {

  public static void main(String[] args) {
    System.out.println(taxInput());
  }

  public static String taxInput() {
    double tax = 0.0;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your tax status: \n0: Single Filer\n1: Married filing jointly or qualified widow(er)\n2: Married filing separately\n3: Head of household.");
    int status = input.nextInt();
    System.out.println("Please enter the total taxable income to the nearest whole dollar");
    double taxableIncome = input.nextDouble();

    
    if (status == 0) {
      if (taxableIncome <= 8350) {
        tax = taxableIncome * 0.1; 
      } else if
      (taxableIncome <= 33950){
        tax = 8350 * 0.1 + (taxableIncome - 8350) * 0.15; 
     } else if
      (taxableIncome <= 82250){
        tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25; 
      } else if
      (taxableIncome <= 171550) {
        tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82550) * 0.28; 
      } else if
      (taxableIncome <= 372950) {
        tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (taxableIncome - 171550) * 0.33;
      } else {
        tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
      }
    } else if (status == 1) {
      if (taxableIncome <= 16700) {
        tax = taxableIncome * 0.1; 
      } else if
      (taxableIncome <= 67900){
        tax = 16700 * 0.1 + (taxableIncome - 16700) * 0.15; 
     } else if
      (taxableIncome <= 137050){
        tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25; 
      } else if
      (taxableIncome <= 208850) {
        tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28; 
      } else if
      (taxableIncome <= 372950) {
        tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (taxableIncome - 208850) * 0.33;
      } else {
        tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
      }
    }
    else if (status == 2) {
      if (taxableIncome <= 8350) {
        tax = taxableIncome * 0.1; 
      } else if
      (taxableIncome <= 33950){
        tax = 8350 * 0.1 + (taxableIncome - 8350) * 0.15; 
     } else if
      (taxableIncome <= 68525){
        tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25; 
      } else if
      (taxableIncome <= 104425) {
        tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28; 
      } else if
      (taxableIncome <= 372950) {
        tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (taxableIncome - 104425) * 0.33;
      } else {
        tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
      }
    }
       else if (status == 3) {
      if (taxableIncome <= 11950) {
        tax = taxableIncome * 0.1; 
      } else if
      (taxableIncome <= 45500){
        tax = 11950 * 0.1 + (taxableIncome - 11950) * 0.15; 
     } else if
      (taxableIncome <= 117450){
        tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25; 
      } else if
      (taxableIncome <= 190200) {
        tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28; 
      } else if
      (taxableIncome <= 372950) {
        tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (taxableIncome - 190200) * 0.33;
      } else {
        tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (186475 - 190200) * 0.33 + (taxableIncome - 186475) * 0.35;
      }
    }
    else {
      System.out.println("Error: invalid status");
      System.exit(1);
      }
    return "Your tax is: " + tax;
  }
}
