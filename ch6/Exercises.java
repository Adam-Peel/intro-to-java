import java.util.Scanner;

public class Exercises {

public static void main (String[] args) {
Scanner input = new Scanner(System.in);
// pentTest();
// sumDigits();
// isPalindrome();
// checkNumberOrder();
// displayPattern(6);
  // sumSeries(20);
  // System.out.println(checkPassword("pass12*12"));
  // System.out.println(convertMillis(555550000L));
  // primePalindromeChecker(100);
  // emirpChecker(100);
  twinPrimes(1000);
}

public static void twinPrimes(int n) {
  String results = "";
  int countLimit = n;
 

  for (int i = 0; countLimit > 0; i++) {
    if (isPrime(i) && isPrime(i+2)){
      countLimit --;
     results += "\n" + "(" + i + ", " + (i + 2) + ")";
    }
  }
  System.out.println(results);
}

public static void emirpChecker(int n) {
  String results = "";
  int resultsCount = n;
  int LINE_COUNT = 0;

  for (int i = 1; resultsCount > 0; i++) {
    if (isPrime(i) && isPrime(reverse(i))) {
      resultsCount --;
      LINE_COUNT ++;
      if (LINE_COUNT % 10 == 0) {results += "\n" + i + " ";} else {results += i + " ";}
    }
  }

  System.out.println(results);
}

public static void primePalindromeChecker(int n) {
  String results = "";
  int resultsCount = n;
  int LINE_COUNT = 0;
  
  for (int i = 2; resultsCount > 0; i ++) {
    if (isPrime(i) && isPalindrome(i)){
      // results += i + " ";
      resultsCount --;
      LINE_COUNT ++;
      if (LINE_COUNT % 10 == 0) {results += "\n" + i + " ";} else {results += i + " ";}
    }
  }
  System.out.println(results);
}

public static boolean isPrime(int n) {
  for (int i = 2; i < n /2; i++)
  {
    if (n % i == 0) {
      return false;
    }
  }
  return true;
}
  
  public static String convertMillis(long millis) {
    int seconds = (int) millis / 1000;
    int minutes = seconds / 60;
      if (minutes > 0) {
        seconds -= (minutes * 60);
      }
    int hours = minutes / 60;
      if (hours > 0) {
        minutes -= (hours * 60);
      }

    return hours + " : " + minutes + " : " + seconds;
  }
  
  public static String checkPassword(String password) {
    int digitCount = 0;

    if (password.length() < 8) {
      return "Invalid password";
    }

    for (int i = 0; i < password.length(); i++) {
      if (password.charAt(i) > 47 && password.charAt(i) < 58) {
        digitCount ++;
      } else if (password.charAt(i) < 65 || password.charAt(i) > 122) {
        return "Invalid password";
      } else if (password.charAt(i) > 90 && password.charAt(i) < 97) {
        return "Invalid password";
      }
    }

      if (digitCount >= 2) {
      return "Valid password";
      } else {
        return "Invalid password";
      }
  }

  public static void sumSeries (int n) {
    String tableHead = "i\t\t\tm(i)";
    double cumulative = 0.0;
    for (double i = 1; i <= n; i++) {
      double sum = (i / (i + 1));
      double temp = i;
      cumulative += sum;
      tableHead += "\n" + temp + "\t\t\t" + cumulative;
    }

    System.out.println(tableHead);
  }

  public static void displayPattern(int n) {
    int pattern = 1;
    
    String display = "1";
    String buffer = "";
    for (int b = 0; b < n; b++){
      buffer += " ";
    }

    display = buffer + display;

    for (int i = 2, j = 1; i <= n; i++, j++) {
      pattern += (i * Math.pow(10, j));
      String temp = "";
      for (int k = 0; k < n - j; k++){
        temp += " ";
      }
      display += "\n" + temp + pattern;
    }

    System.out.println(display);
  }

  public static void checkNumberOrder() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter three numbers, to get the order");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();
    displaySortedNumbers(num1, num2, num3);

  }

  public static void displaySortedNumbers(double num1, double num2, double num3) {
    double first, second, third;

    if (num1 < num2 && num1 < num3) {
      first = num1;
      if (num2 < num3) {
        second = num2;
        third = num3;
      } else {
        second = num3;
        third = num2;
      }
    } else if (num2 < num1 && num2 < num3) {
      first = num2;
      if (num1 < num3) {
        second = num1;
        third = num3;
      } else {
        second = num3;
        third = num1;
      }
    } else {
      first = num3;
      if (num1 < num2) {
        second = num1;
        third = num2;
      } else {
        second = num2;
        third = num1;
      }
    }

  System.out.println(first + "\n" + second + "\n" + third);

  }

  public static void pentTest() {
  int NUMBER_OF_RETURNS = 100;
  int RETURNS_PER_LINE = 10;
  String returns = "";
  for (int i = 1; i <= NUMBER_OF_RETURNS; i++) {
    int number = getPentagonalNumber(i);
    String add = String.format("%7d", number);
    if (i % RETURNS_PER_LINE == 0) {
    returns += add + "\n";
    } else {
      returns += add;
    }
  } 
  System.out.println(returns);
}

public static int getPentagonalNumber(int n) {
  return n * (3 * n - 1)/2;
}

public static void sumDigits() {
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter an integer");
  int number = input.nextInt();
  int givenNumber = number;
  int sum = 0;

  do {
    int digit = number % 10;
    sum += digit;
    number = number / 10;
  }
  while (number > 10);

  sum += number;
  input.close();
  System.out.println("The sum of the digits in " + givenNumber + " is: " + sum);
}

  public static int reverse(int number) {
    int reversed = 0;
    while (number > 0) {
        int digit = number % 10;       
        reversed = reversed * 10 + digit; 
        number = number / 10;          
    }
    // System.out.println(reversed);
    return reversed;
  }

  public static boolean isPalindrome(int n) {
    int number = n;
   if (number == reverse(number)){
    // System.out.println("" + number + " Is a palindrome");
    return true;
   } else {
    // System.out.println("" + number + " Is not a palindrome");
    return false;
   }
  }

}