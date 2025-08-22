import java.util.Scanner;

public class Exercises_Ch2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Exercise 2.1 - Conversion of Celsius to Fahrenheit");
    System.out.println("Please input the temperature to be converted, to 1 decimal place (e.g. 35.2)");
    double celsius = input.nextDouble();
    double fahrenheit = (9.0 / 5.0) * celsius + 32;
    System.out.println("The temperature in fahrenheit is: " + fahrenheit + " degrees F.");

    System.out.println("Exercise 2.2 - Calculate volume of a cylinder");
    System.out.println("Enter the radius and length of a cylinder");
    double radius = input.nextDouble();
    double length = input.nextDouble();
    double volume = Math.PI * radius * radius * length;
    System.out.println("The volume of the cylinder is: " + volume + " cm3.");
    System.out.println("Exercise 2.3 - Convert feet into meters");
    System.out.println("Please enter the number of feet to be converted into meters");
    double feet = input.nextDouble();
    System.out.println(feet + " feet, is approximately: " + feet * 0.305 + " meters.");
    System.out.println("Exercise 2.4 - Convert lbs to kg");
    System.out.println("Please input a weight in lbs, to convert to kg");
    double lbs = input.nextDouble();
    System.out.println(lbs + " pounds is equivalent to: " + lbs * 0.454 + " kilograms.");
    System.out.println("Exercise 2.5 - Calculate tips");
    System.out.println("Please enter the bill total to 1dp and the tip rate as a percentage - e.g. 100, 10.");
    double total = input.nextDouble();
    double rate = input.nextInt();
    double tip = total * (rate / 100);
    double bill = tip + total;
    System.out.println("The gratuity is: " + tip + ". The total is £" + bill);
    System.out.println("Exercise 2.6 - Sum the digits in an integer.");
    System.out.println("Please provide an integer between 0 and 1000");
    int digits = input.nextInt();
    System.out.println(integerSum(digits));
    System.out.println("Exercise 2.7 - Find the number of years.");
    System.out.println("Enter a number of minutes to convert into years and days");
    long minutes = input.nextLong();
    System.out.println(minutesToYears(minutes));
    System.out.println("Exercise 2.13 - Compound interest");
    int savings = input.nextInt();
    System.out.println("The value is: " + interestValue(savings));
    System.out.println("Exercise 2.14 - BMI Conversion");
    System.out.println(BMIInput());
    System.out.println("Exercise 2.15 - Geometry: Distance of two points");
    System.out.println(pointDistance());
    
  }

public static int integerSum (int number) {

  int count = 0;
  int numberToSum = number;

  while (numberToSum > 10) {
    count += numberToSum % 10;
    numberToSum /= 10;
  };

  count += numberToSum;
  return count;
}

public static String minutesToYears (long minutes) {
  long minsInDay = 60 * 24; 
  long days = minutes / minsInDay;
  long years = days / 365;

  if ( years > 0) {
  return minutes + " minutes, is approximately: " + years + " years, and " + (days - (years * 365)) + " days.";
  } else {
    return minutes + " minutes, is approximately: " + (days - (years * 365)) + " days."; 
  }
}

public static double interestValue (int capital) {
  double rate = 5.00;
  double monthlyInterest = (rate / 100) / 12;
  int months = 6;
  double total = capital * (1 + monthlyInterest);

  for (int i = 1; i < months; i++) {
    total = (capital + total) * (1 + monthlyInterest); 
  }

  return total;
}

public static String BMIInput () {
  Scanner input = new Scanner(System.in);
  String weightRef = "";
  String heightRef = "";
  Double BMI = 0.0;
  System.out.println("Press 1 if you'd like to enter your details in lb. and inches or 2 if you'd like to enter your details in kg and cm.");
  int reference = input.nextInt();
  if (reference == 1) {
    weightRef = "lb";
    heightRef = "inches";} 
    else {
      weightRef = "kg";
      heightRef = "cm";}

  System.out.println("Please enter your weight in " + weightRef + ", to one decimal place");
  double weight = input.nextDouble();
  System.out.println("Please enter your height in " + heightRef);
  double height = input.nextDouble();

  if (reference == 1) {
    BMI = BMIImperial(weight, height);}
  else {
    BMI = BMIMetric(weight, height);}

  return ("Given the input, your BMI is: " + BMI);  

}
 
public static double BMIMetric (double weight, double height) {
  return weight / Math.pow((height / 100), 2);
}

public static double BMIImperial (double weight, double height) {
  return (weight * 703) / Math.pow(height, 2);
}

public static String pointDistance() {
  Scanner input = new Scanner(System.in);
  double x1 = 0;
  double x2 = 0;
  double y1 = 0;
  double y2 = 0;

  System.out.println("Please enter the coordinates for the first point in the form of x y - e.g. 2.3 3");
  x1 = input.nextDouble();
  y1 = input.nextDouble();
  System.out.println("Please enter the coordinates for the second point in the form of x y - e.g. 2.3 3");
  x2 = input.nextDouble();
  y2 = input.nextDouble();

  double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);

 return "The distance between the two points is: " + distance;
}
 
}