import java.util.Scanner;

public class Exercises {

public static void main (String[] args) {
Scanner input = new Scanner(System.in);
// pentTest();
// sumDigits();
isPalindrome();
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
    System.out.println(reversed);
    return reversed;
  }

  public static boolean isPalindrome() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer to check if it is a palindrome");
    int number = input.nextInt();
   if (number == reverse(number)){
    System.out.println("" + number + " Is a palindrome");
    return true;
   } else {
    System.out.println("" + number + " Is not a palindrome");
    return false;
   }
  }

}