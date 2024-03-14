import java.util.Scanner;

public class methodFind {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double num1 = s.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = s.nextDouble();

    System.out.print("Enter the third number: ");
    double num3 = s.nextDouble();

    double min = findMin(num1, num2, num3);
    System.out.println("\nLeast value " + min);
  }

  public static double findMin(double num1, double num2, double num3) {
    double min = num1;

    if (num2 < min) {
      min = num2;
    }

    if (num3 < min) {
      min = num3;
    }

    return min;
  }
}
