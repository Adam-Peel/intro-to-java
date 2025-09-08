import java.util.Scanner;

public class Exercises {


  public static void main (String[] args) {

    System.out.println("5.1 - Count positive and negative numbers and compute average");
    integerCount();
  }

  public static void integerCount() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer, the program ends if it is 0"); 

    int firstNumber = input.nextInt();
    if (firstNumber == 0) {
      System.out.println("No numbers are entered except zero");
    }

    else {

    
    int number = firstNumber;
    int totalCount = 0;
    int positiveCount = 0;
    int negativeCount = 0;
    double total = 0;
    double average;
    
    while (number != 0 )
    {
      total = total + number;
      if (number > 0) {
    positiveCount++;
      } else {
    negativeCount++;
      }
      totalCount ++;
      number = input.nextInt();
    }

    average = total / totalCount;
      
    System.out.println("The number of positives is: " + positiveCount);
    System.out.println("The nuber of negative is : " + negativeCount);
    System.out.println("The total is: " + total);
    System.out.println("The average is: " + average);
    }
  }
}