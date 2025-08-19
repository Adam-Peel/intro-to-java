import java.util.Scanner;

public class ComputeChange {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int[] tests = {50, 20, 10, 5, 2, 1};
    System.out.println("Please enter the total amount of money in, e.g. £15.11");

    double change = input.nextDouble();
    double pennyChange = change * 100;
    int pennies = (int) pennyChange;
    int pounds = pennies / 100;
    int remainingPennies = pennies % 100;
    String returnString = "";
    int remainder = remainingPennies;
    
    if (remainingPennies % 100 == 0) {
      System.out.println("The total change can be given with " + pounds + " pound coins.");
    } else {
      returnString = "The total change can be given with " + pounds + " pound coins, ";
    
      for (int i = 0; i < tests.length; i++) {
      
      if (remainder % tests[i] == 0) {
        System.out.println(returnString += "and " + remainder / tests[i] + " " + tests[i] + "p coins.");
        remainder = (remainder % tests[i]);
        break;
      } 
      
      if (remainder < tests[i]){
        returnString += "";
      }
      else {
        int coinCount = remainder / tests[i];
        returnString += coinCount + " " + tests[i] + "p coins, ";
        remainder -= coinCount * tests[i];
      }
    } 
    } 
    System.out.println(returnString);
  }
}