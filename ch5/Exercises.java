import java.util.Scanner;

public class Exercises {


  public static void main (String[] args) {

    // System.out.println("5.1 - Count positive and negative numbers and compute average");
    // integerCount();
    // System.out.println("5.7 - Finance - compute future tuition");
    // System.out.println(futureTuition());
    // System.out.println("5.10 - Find numbers divisible by 5 AND 6");
    // System.out.println(fiveAndSixDivider());
    // System.out.println("5.11 - Find numbers divisible by 5 OR 6, but NOT BOTH");
    // System.out.println(fiveOrSixDivider());
    // System.out.println("5.12 - Find the smallest n");
    // System.out.println(smallestN());
    // System.out.println("5.13 - Find the largest n");
    // System.out.println(largestN());
    System.out.println("5.16 - Find the smallest factors of an integer");
    System.out.println(smallestFactors());
  }

  public static String smallestFactors() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer");
    int numberToFactor = input.nextInt();
    String factors = "";
    boolean endOfLoop;
      
    do {
      endOfLoop = true;
      for (int i = 2; i <= numberToFactor / 2; i++)
      {
        if (numberToFactor % i == 0) {
          factors += "" + i + " ";
          numberToFactor /= i;
          endOfLoop = false;
          break;
        }
      }
    }
    while (endOfLoop == false);  
       
    if (numberToFactor > 1) {
      factors += numberToFactor + " ";
    }    

    if (factors.length() > 0) {
      return factors;
    } else {
      return "The number is a prime";
    }

    }


  public static int smallestN() {
    int n = 100;
    int nSquare = 0;

    while (nSquare <= 12000){
      nSquare = (int) Math.pow(++n, 2);
    }

    return n;
  }

  public static int largestN() {
    int nCubed = 0;
    int n = 20;

    while (nCubed < 12000) {
      nCubed = (int) Math.pow(++n, 3);
    }

    return n-1;
  }

  public static String fiveOrSixDivider() {
    int NUMBER_PER_LINE = 10;
    int numberCount = 0;
    String numbers = "";
    for (int i = 100; i < 1000; i++) {
      if (i % 5 == 0 ^ i % 6 == 0) {
        numberCount++;
        if (numberCount % 10 == 0) {
          numbers += i + "\n";
        } else {
          numbers += i + " ";
        }
      }
    }
    return numbers;
  }

  public static String fiveAndSixDivider() {
    int NUMBER_PER_LINE = 10;
    int numberCount = 0;
    String numbers = "";
    for (int i = 100; i < 1000; i++) {
      if (i % 5 == 0 && i % 6 == 0) {
        numberCount++;
        if (numberCount % 10 == 0) {
          numbers += i + "\n";
        } else {
          numbers += i + " ";
        }
      }
    }
    return numbers;
  }

  public static String futureTuition() {
    double fee = 10000;
    double total = 0;
    String calculation = "The tution fee in 10 years will be: £";

    for (int i = 1; i < 15; i++) {
      fee = fee * 1.05;

      if (i == 10) {
        String year10 = String.format("%.2f", fee);
        calculation = calculation + year10;
        continue;
      } else if (i > 10) {
        total = total + fee;
      }
    }

    String finalTotal = String.format("%.2f", total);
    return calculation + "\n The total fee for a programme starting in year 11 is: £" + finalTotal;
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