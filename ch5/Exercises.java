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
    // System.out.println("5.16 - Find the smallest factors of an integer");
    // System.out.println(smallestFactors());
    // System.out.println("5.17 - Display pyramid");
    // // System.out.println(displayPyramid());
    // System.out.println("5.19 - Display numbers pyramid"); // Must use nested for loop
    // System.out.println(displayNumbersPyramid());
    // System.out.println("5.21 - Finance - compare loans");
    // System.out.println(compareLoans());
    System.out.println("5.25 - Compute PI");
    System.out.println(computePI());
    System.out.println("5.33 - Perfect number");
    
  }

  public static String computePI() {
    String piValues = "";
    
    for (int i = 10000; i <= 100000; i += 10000) {
      piValues += "Value for: " + i + " " + piSeries(i) + "\n";
    }  
    return piValues;
  }

  public static double piSeries(int seriesLimit) {
    double seriesValue = 0.0;
    for (double i = 3.0, j = 1.0; i < seriesLimit; i += 2.0, j += 1.0) {
      
        if (j % 2 != 0)
        {
          seriesValue += (1.0/i);
        } else {
          seriesValue -= (1.0/i);
        }
    }
  return 4.0 * (1.0 - seriesValue);
  }

  public static String compareLoans() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the loan amount");
    double loan = input.nextDouble();
    System.out.println("Please enter the number of years");
    int years = input.nextInt();
    String table = "Interest Rate  Monthly Payment  Total Payment\n";
    // payment formula

    for (double i = 5.000; i <= 8.000; i+= 1.0/8) {
    double payment = (loan * ((i / 100 / 12) * Math.pow(1 + (i / 100 /12), 12 * years))) / (Math.pow(1 + (i / 100 /12), 12 * years) - 1);
      table += i + "%    " + Math.round(payment * 100) / 100.0 + "           " + Math.round(payment * years * 12 * 100) / 100.0 + "\n";
    }


    return table;
  }

  public static String displayNumbersPyramid() {
    String output = "";

    for (int i = 1; i < 8; i++) {
        int count = 1;
      for (int j = 7; j > 0; j--) {
       if (j <= i) {
        output += count;
        output += "  ";
        count *= 2;
       } else {
        output += "  ";
       }
      }
        output += count;
        output += "  ";
      for (int k = 1; k < 8; k++) {
        if (k <= i) {
        count /= 2;
        output += count;
        output += "  ";
        } else {
          output += "  ";
        }
      }
      output += "\n";
    }

    return output;
  }

  public static String displayPyramid() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer from 1 to 15");
    int lineWidth = input.nextInt();
    String output = "";

    for (int i = 1; i <= lineWidth; i++) {
      for (int j = lineWidth; j > 1; j--){
        if (j <= i) {
          output += j;
        } else {
          output += " ";
        }
      }
        output += "1";
       for (int k = 2; k <= lineWidth; k++){
        if (k <= i) {
          output += k;
        } else {
          output += " ";
        }
      }
      output += "\n";
    }

    return output;
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