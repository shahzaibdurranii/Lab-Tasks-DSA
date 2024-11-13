package Lab1.HomeTasks;

public class Task2 {
  public static void main(String[] args) {
    int num = 123456789;
    Integer numObject = num;
    int evenCount = 0;
    int oddCount = 0;
    String numString = numObject.toString();

    for (int i = 0; i < numString.length(); i++) {
      int digit = Character.getNumericValue(numString.charAt(i));
      if (digit % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
    }

    System.out.println("Number: " + numObject);
    System.out.println("Count of even digits: " + evenCount);
    System.out.println("Count of odd digits: " + oddCount);
  }
}
