import java.util.Scanner;

public class Exercises {

  public static void main (String[] args) {

    System.out.println("Exercise 4.1 - Geometry: Area of a pentagon");
    System.out.println(pentagonArea());
    System.out.println("Exercise 4.2 - Geometry: Great circle distance");
    System.out.println(greatCircleDistance());
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
}