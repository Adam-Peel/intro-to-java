import java.util.Scanner;

public class Exercises {

  public static void main (String[] args) {

    System.out.println("Exercise 4.1 - Geometry: Area of a pentagon");
    System.out.println(pentagonArea());
    System.out.println("Exercise 4.2 - Geometry: Great circle distance");
    System.out.println(greatCircleDistance());
    System.out.println("Exercise 4.6 - Random points on a circle");
    System.out.println(randomPoints());
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

  public static double pointDistance(double x1, double y1, double x2, double y2) {
  double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
  return distance;
  }
}