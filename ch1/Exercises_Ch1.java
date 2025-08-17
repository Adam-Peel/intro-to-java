import java.security.InvalidAlgorithmParameterException;

public class Exercises_Ch1 {
private static String welcomeJava = "Welcome to Java";
private static String[] j = {"    J", "    J","J   J"," J J "};
private static String[] a = {"   A   ", "  A A  "," AAAAA ","A     A"};
private static String[] v = {"V     V", " V   V ","  V V  ","   V   "};


  public static void main(String[] args) {
    System.out.println("1.1 Display 3 messages");
    welcome();
    System.out.println("1.1 Display 5 messages");
    welcome5();
    System.out.println("1.3 Display a pattern");
    printJava();
    System.out.println("1.4 Print a table");
    rightPad();
    System.out.println("1.5 Compute expression");
    System.out.println(((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));
    System.out.println("1.6 Sum series");
    System.out.println(sumSeries(9));
    System.out.println("1.7 Approximate pi to 11");
    System.out.println(approxPi(11));
    System.out.println("1.7a Approximate pi to 13");
    System.out.println(approxPi(13));
    System.out.println("1.8 Area and Perimeter of Circle");
    System.out.println(circleCircumference(5.5));
    System.out.println(circleArea(5.5));
    System.out.println("1.9 Area and Perimeter of Quadrilateral");
    System.out.println(quadPerimeter(4.5, 7.9));
    System.out.println(quadArea(4.5, 7.9));
    System.out.println("1.10 Average Speed MPH");
    System.out.println(averageSpeedMPH(14, 45, 30));
    System.out.println("1.11 Population Estimate");
    populationEstimate();
    System.out.println("1.12 Average Speed KPH");
    System.out.println(averageSpeedKPH(24, 100, 35));
    System.out.println("1.13 Cramer\'s Algebra");
    
      cramers(3.4, 50.2, 2.1, 0.55, 44.5, 5.9);
      
  }

  private static void welcome() {
    System.out.println(welcomeJava);
    System.out.println("Welcome to Computer Science");
    System.out.println("Programming is fun");
  }

  private static void welcome5() {
    for (int i = 0; i < 5; i++) {
      System.out.println(welcomeJava);
    }
  }

  private static void printJava() {
    for (int i = 0; i < 4; i++) {
      System.out.print(j[i] + "  " + a[i] + "  " + v[i] + "  " + a[i]);
      System.out.println("");
    }
  }

  private static void rightPad() {
    for (int i = 0; i < 5; i ++) {
      if (i == 0) {
        System.out.println("a" + "      " + "a^2" + "     " + "a^3" + "     ");
      } else if (i < 3) {
        System.out.println(i + "      " + i*i + "    " + i*i*i);
      } else if (i < 4) {
        System.out.println(i + "      " + i*i + "    " + i*i*i);
      } else {
        System.out.println(i + "      " + i*i + "   " + i*i*i);
      }
    }
  }

  private static int sumSeries (int stop) {
    int result = 0;
    for (int i = 0; i <= stop; i++){
      result += i;
    }
    return result;
  }

  private static double approxPi (int stop) throws IllegalArgumentException {
   int operatorCount = 1;
    if (stop % 2 == 0) {
      throw new IllegalArgumentException("stop value must be odd");
    }
    double denominator = 0;
    for (int i = 3; i <= stop; i += 2) {
      if (operatorCount % 2 == 0)
       {denominator += (1.0 / i);} else {
        denominator += (-1.0 / i);
       }
      operatorCount ++;
    }
    return (4 * (1.0 + denominator));
  }

  private static double circleCircumference (double radius) {
    return 2 * Math.PI * radius;
  }

  private static double circleArea (double radius) {
    return Math.PI * radius * radius;
  }

  private static double quadArea(double width, double height) {
    return width * height;
  }

  private static double quadPerimeter(double width, double height) {
    return (2 * width) + (2 * height);
  }

  private static double averageSpeedMPH(int km, int minutes, int seconds) {
    double time = (minutes + (seconds / 60)); 
    double distance = (km / 1.6);
    return (distance / (time / 60));
  }

  private static void populationEstimate() {
    int currentPop = 312032486;
    int secondsInYear = 31557600;
    double birthRate = secondsInYear / 7.0;
    double deathRate = secondsInYear / 13.0;
    double immigrationRate = secondsInYear / 45.0;
    
    for (int i = 0; i < 5; i++) {
      System.out.println("Year " + i + " :" + currentPop);
      currentPop += (birthRate + immigrationRate);
      currentPop -= (deathRate);
    }
  }

    private static double averageSpeedKPH(int miles, int minutes, int seconds) {
    double time = (minutes + (seconds / 60)); 
    double distance = (miles * 1.6);
    return (distance / (time / 60));
  }

  private static void cramers(double a, double b, double c, double d, double e, double f) {
    double x;
    double y;
    if (((a * d) - (b * c)) == 0) {
      System.out.println("ad - bc cannot equal 0");
    }

    x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
    y = (((a * f) - (e * c)) / ((a * d) - (b * c)));

    System.out.println("x is: " + x );
    System.out.println("y is: " + y);

  }
}
