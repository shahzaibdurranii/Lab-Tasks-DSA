package Lab5.LabTasks;
import java.util.Scanner;
public class Task2 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; 
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;}}
            System.out.print("Iteration " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");}
            System.out.println();
            if (!swapped) {
                break; }
        }
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }}}

