import java.util.Scanner;

public class Exercises {

  public static void main (String[] args) {

    System.out.println("Exercise 4.1 - Geometry: Area of a pentagon");
    System.out.println(pentagonArea());
    System.out.println("Exercise 4.2 - Geometry: Great circle distance");
    System.out.println(greatCircleDistance());
    System.out.println("Exercise 4.6 - Random points on a circle");
    System.out.println(randomPoints());
    System.out.println("Exercise 4.7 - Points on a pentagon");
    System.out.println(pentagonPoints());
    System.out.println("Exercise 4.8 - Find the ASCII code");
    System.out.println(findASCII());
    System.out.println("Exercise 4.9 - Find the unicode");
    System.out.println(findUnicode());
    System.out.println("Exercise 4.11 - Find the hex value");
    System.out.println(findHex());
    System.out.println("Exercise 4.13 - Vowel or consonant");
    System.out.println(findVowel());
    System.out.println("Exercise 4.21 - Check SSN");
    System.out.println(checkSSN());
    System.out.println("Exercise 4.22 - Check substring");
    System.out.println(checkSubstring());
    System.out.println("Exercise 4.23 - Financial payroll");
    financialPayroll();
    System.out.println("Exercise 4.25 - Random Numberplate generator");
    System.out.println(randomNumberPlate());
  }

  public static String randomNumberPlate() {
    String number = "";
    
    for (int i = 0; i < 4; i ++) {
      int numberCode = (int) (Math.random() * 10) + 48;
      number += (char) numberCode;
    }

    String letters = "";

    for (int i = 0; i < 3; i++){
      int numberCode = (int) (Math.random() * 26) + 65;
      letters += (char) numberCode;
    }

    return letters + "-" + number;
  }

  public static void financialPayroll() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter employee's name");
    String name = input.nextLine();
    System.out.println("Enter number of hours worked in a week");
    double hours = input.nextDouble();
    System.out.println("Please enter hourly rate");
    double rate = input.nextDouble();
    System.out.println("Please enter the federal tax rate as a decimal (e.g. 20% as 0.2)");
    double fedTaxRate = input.nextDouble();
    System.out.println("Please enter the state tax rate as a decimal (e.g. 20% as 0.2)");
    double stateTaxRate = input.nextDouble();
    double gross = hours * rate;
    double stateTax = gross * stateTaxRate;
    double fedTax = gross * fedTaxRate;
    double totalTax = stateTax + fedTax;
    double totalPay = gross - totalTax;

    System.out.println("Payroll Statement\nEmployee: " + name + "\nHours worked: " + hours + "\nPay Rate: $" + rate + "\nGross pay: $" + gross);
    System.out.println("Deductions: \n  Federal Tax (" + fedTaxRate * 100 + "%): $" + fedTax + "\n  State Tax (" + stateTaxRate * 100 + "%): $" + stateTax +"\n Total deduction: $" + totalTax);
    System.out.println("Net Pay: $" + totalPay);
  }

  public static String checkSubstring() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter string 1");
    String string1 = input.nextLine();
    System.out.println("Please enter string 2");
    String string2 = input.nextLine();

    if (string1.contains(string2)) {
      return string2 + " is a substring of " + string1;
    } else {
      return string2 + " is not a substring of " + string1;
    }
  }

  public static String checkSSN() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please input the SSN number in the format DDD-DD-DDDD, where D is a digit");
    String SSN = input.nextLine();

    if (SSN.length() != 11) {
    System.out.println("Sorry - incorrect size. Please input the SSN number in the format DDD-DD-DDDD, where D is a digit");
    }
    
    for (int i = 0; i < SSN.length(); i++) {
      char ch = SSN.charAt(i);
      
      if (i == 3 || i == 6) {
        
        if (ch != '-') {
          return "Invalid input - wrong format: " + SSN;
         }
      }

      else {
        if (!Character.isDigit(ch)) {
        return "Invalid input - wrong format: " + SSN;
          }
        }
      }

      return SSN + " is a valid social security number";
    }
  

  public static String findVowel() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a letter");
    char letter = input.next().charAt(0);
    int code = (int) letter;
    if (code < 65 || code > 122 || (code > 90 && code < 97)) {
      return "Invalid input";
    }
    String type = "";

    switch (code) {
      case 97:
      case 101:
      case 105:
      case 111:
      case 117:
      case 65:
      case 69:
      case 73:
      case 79:
      case 85: type = "vowel"; break;
      default: type = "consonant";
    }
      return "The letter " + letter + " is a " + type;
    
  }

  public static String findHex() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a decimal value");
    int decimal = input.nextInt();
    String hexString = "The hex value is: ";
    if (decimal < 0 || decimal > 15) {
      return "Error: " + decimal + " is an invalid input";
    } else if (decimal < 10 ) {
      return hexString + decimal;
    } else {
      switch (decimal) {
        case 10: return hexString + "A";
        case 11: return hexString + "B";
        case 12: return hexString + "C";
        case 13: return hexString + "D";
        case 14: return hexString + "E";
        case 15: return hexString + "F";
        default: return "Invalid input";
      }
    }

  }

  public static String pentagonArea() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the length from the centre of a pentagon to a vertex");
    double length = input.nextDouble();
    double sideLength = 2 * length * Math.sin((Math.PI / 5));
    double area = 5 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / 5));
    return "The area of the pentagon is: " + area;
  }

  public static String greatCircleDistance() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the latitude and longitude in degrees for point 1");
    double x1 = Math.toRadians(input.nextDouble());
    double y1 = Math.toRadians(input.nextDouble());
       System.out.println("Please enter the latitude and longitude in degrees for point 2");
    double x2 = Math.toRadians(input.nextDouble());
    double y2 = Math.toRadians(input.nextDouble());
    double earthRadius = 6371.01;
    double distance = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    return "The distance between the two points is: " + distance + " km.";
  }

  public static String randomPoints() {
    double radius = 40.0;
    double alpha1 = Math.random() * 2 * Math.PI;
    double x1 = radius * Math.cos(alpha1);
    double y1 = radius * Math.sin(alpha1);
    double alpha2 = Math.random() * 2 * Math.PI;
    double x2 = radius * Math.cos(alpha2);
    double y2 = radius * Math.sin(alpha2);
    double alpha3 = Math.random() * 2 * Math.PI;
    double x3 = radius * Math.cos(alpha3);
    double y3 = radius * Math.sin(alpha3);
    double distance1 = pointDistance(x2, y2, x3, y3);
    double distance2 = pointDistance(x1, y1, x3, y3);
    double distance3 = pointDistance(x1, y1, x2, y2);

    double angle1 = Math.acos((distance1 * distance1 - distance2 * distance2 - distance3 * distance3) / (-2 * distance2 * distance3));
    double angle2 = Math.acos((distance2 * distance2 - distance1 * distance1 - distance3 * distance3) / (-2 * distance1 * distance3));
    double angle3 = Math.acos((distance3 * distance3 - distance1 * distance1 - distance2 * distance2) / (-2 * distance1 * distance2));

    angle1 = Math.toDegrees(angle1);
    angle2 = Math.toDegrees(angle2);
    angle3 = Math.toDegrees(angle3);

    return "The three angles are: " + angle1 + " " + angle2 + " " + angle3;
  }

  public static String pentagonPoints() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please entre the radius of the circle");
    double radius = input.nextDouble();
    double x2 = radius * Math.cos(Math.toRadians(18));
    double y2 = radius * Math.sin(Math.toRadians(18));
    String coordinates2 = "\n(" + x2 + " , " + y2 + ")";
    double x10 = x2 * -1;
    double y10 = y2;
    String coordinates10 = "\n(" + x10 + " , " + y10 + ")";
    double x12 = 0.0;
    double y12 = radius;
    String coordinates12 = "\n(" + x12 + " , " + y12 + ")";
    double x5 = radius * Math.cos(Math.toRadians(54));
    double y5 = radius * Math.sin(Math.toRadians(54));
    String coordinates5 = "\n(" + x5 + " , " + y5 + ")";
    double x7 = x5;
    double y7 = y5 * -1;
    String coordinates7 = "\n(" + x7 + " , " + y7 + ")";

    return "The coordinates of the 5 points of the pentagon are:\n" + coordinates2 + coordinates12 + coordinates10 + coordinates7 + coordinates5;
  }

  public static double pointDistance(double x1, double y1, double x2, double y2) {
  double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
  return distance;
  }

  public static String findASCII() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a character");
    char character = input.next().charAt(0);
    int code = (int) character;
    return "The code for: " + character + " is " + code;
  }

  public static String findUnicode() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number between 0 and 127");
    int code = input.nextInt();
    char character = (char) code;
    return "The character for: " + code + " is " + character;
  }
}