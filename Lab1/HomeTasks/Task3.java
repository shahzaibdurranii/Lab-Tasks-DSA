package Lab1.HomeTasks;

public class Task3 {
  public static void main(String[] args) {
    Integer num1 = -25;
    Double num2 = 16.0;
    Integer power = 3;

    int absValue = Math.abs(num1);
    System.out.println("Absolute value of " + num1 + " is: " + absValue);

    double sqrtValue = Math.sqrt(num2);
    System.out.println("Square root of " + num2 + " is: " + sqrtValue);

    double powerValue = Math.pow(num2, power);
    System.out.println(num2 + " raised to the power of " + power + " is: " + powerValue);
  }
}
