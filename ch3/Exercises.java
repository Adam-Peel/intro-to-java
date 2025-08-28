import java.util.Scanner;

public class Exercises {

  public static void main (String[] args) {
  System.out.println("3.1 - Algebra - Quadratic Equations");
  System.out.println(quadratic());
  System.out.println("3.4 Random month");
  System.out.println(randomMonth());
  System.out.println("3.5 Future dates");
  System.out.println(futureDate());
  System.out.println("3.8 - Sort three integers");
  System.out.println(sortIntegers());
  System.out.println("3.9 - Check ISBN");
  System.out.println(ISBNCheck());
  }

public static String quadratic() {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter values for a, b, c");
  double a = input.nextDouble();
  double b = input.nextDouble();
  double c = input.nextDouble();
  String discriminantStatus = "The equation has ";

  double discriminant = Math.pow(Math.pow(b,2) - 4 * a * c, 0.5);
  if (discriminant == 0) {
    double rootOne = ((-1 * b + discriminant) / 2 * a);
    discriminantStatus += "one root " + rootOne;
  } else if (discriminant > 0) {
    double rootOne = ((-1 * b + discriminant) / 2 * a);
    double rootTwo = ((-1 * b - discriminant) / 2 * a);
    discriminantStatus += "two roots " + rootOne + " " + rootTwo;
  } else {
    discriminantStatus += "no real roots";
  }
  return discriminantStatus;
}

public static String randomMonth() {
  int randomNum = (int) (Math.random() * 12);
  String month = "December";
  switch (randomNum) {
    case 0: month = "January"; break;
    case 1: month = "February"; break;
    case 2: month = "March"; break;
    case 3: month = "April"; break;
    case 4: month = "May"; break;
    case 5: month = "June"; break;
    case 6: month = "July"; break;
    case 7: month = "August"; break;
    case 8: month = "September"; break;
    case 9: month = "October"; break;
    case 10: month = "November"; break;
    case 11: month = "December"; break;
    default: return "Error in logic";
  }
    return month;
}

public static String futureDate() {
   Scanner input = new Scanner(System.in);
   String elapsedDayOfWeek = "";
   System.out.println("Please enter today's day - Sunday = 0, Saturday = 6");
   int day = input.nextInt();
   String dayOfWeek = dayProvider(day);
    
   System.out.println("Please enter the number of days to be elapsed");
   int elapse = input.nextInt();

   int dayShift = ((day + elapse) % 7 + 7) %7;
   elapsedDayOfWeek = dayProvider(dayShift);

   return "Today is: " + dayOfWeek + " and the future day is " + elapsedDayOfWeek;
}

public static String dayProvider (int dayToProvide) {
    switch(dayToProvide) {
      case 0: return "Sunday";
      case 1: return "Monday";
      case 2: return "Tuesday";
      case 3: return "Wednesday";
      case 4: return "Thursday";
      case 5: return "Friday";
      case 6: return "Saturday";
      default: return "Invalid day";
    }
}

public static String sortIntegers() {
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter 3 integers");
  int a = input.nextInt();
  int b = input.nextInt();
  int c = input.nextInt();
  int first = 0;
  int second = 0;
  int third = 0;

  if (a == b && a == c) {
    return "All integers are the same";
  }

  if (a < c && a < b) {
    first = a;
    if (b < c) {
      second = b; 
      third = c;
    } else {
      second = c;
      third = b;
    }
  } else if (b < c && b < a) {
    first = b;
    if (a < c) {
      second = a;
      third = c;
    } else {
      second = c;
      third = a;
    }
  } else {
    first = c;
    if (a < b) {
      second = a;
      third = b;
    } else {
      second = b;
      third = a;
    }
  }
  return first + " " + second + " " + third;
}

public static String ISBNCheck() {
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter the first 9 digits of an ISBN code");
  String ISBN = input.next();
  
  if (ISBN.length() != 9) {
    return "Sorry, the input is invalid - it must be 9 digits long";
  } 

  int checksum = 0;

    for (int i = 0; i < ISBN.length(); i++) {
        int digit = Character.getNumericValue(ISBN.charAt(i));
        checksum += digit * (i + 1);
        }
   

  if (checksum % 11 == 10) {
  return "The ISBN number is " + ISBN + "X";} else {
    return "The ISBN number is " + ISBN + (checksum % 11);
  }
    
}

}

