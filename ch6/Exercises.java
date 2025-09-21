import java.util.Scanner;

public class Exercises {

public static void main (String[] args) {
pentTest(); 

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

}