package LabTasks;

public class LabTask2 {
  public static void main(String[] args) {
    int[] existingArray = { 1, 2, 3, 4 };
    int[] newArray = { 5, 6, 7, 8 };
    int[] mergedArray = new int[existingArray.length + newArray.length];
    int index = 0;
    for (int i = 0; i < existingArray.length; i++) {
      mergedArray[index++] = existingArray[i];
    }
    for (int i = 0; i < newArray.length; i++) {
      mergedArray[index++] = newArray[i];
    }
    System.out.println("Merged Array:");
    for (int num : mergedArray) {
      System.out.print(num + " ");
    }
  }
}
