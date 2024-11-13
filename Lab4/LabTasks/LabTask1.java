package LabTasks;
public class LabTask1 {
  public static void main(String[] args) {
    // shahzaib durrani
    int[] array1 = { 1, 2, 3, 4 };
    int[] array2 = { 5, 6, 7, 8 };

    System.out.println("Original Array 1:");
    for (int num : array1) {
      System.out.print(num + " ");
    }
    System.out.println("\nOriginal Array 2:");
    for (int num : array2) {
      System.out.print(num + " ");
    }

    for (int i = 0; i < array1.length; i++) {
      int temp = array1[i];
      array1[i] = array2[i];
      array2[i] = temp;
    }

    System.out.println("\n\nAfter swapping:");
    System.out.println("Array 1:");
    for (int num : array1) {
      System.out.print(num + " ");
    }
    System.out.println("\nArray 2:");
    for (int num : array2) {
      System.out.print(num + " ");
    }
  }
}
