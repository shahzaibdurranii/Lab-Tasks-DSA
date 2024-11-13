package LabTasks;

public class LabTask3 {
  public static void main(String[] args) {
          String[] strings = {"civic", "hello", "shahzaib", "java", "level"};
          for (String str : strings) {
              if (isPalindrome(str)) {
                  System.out.println(str + " is a palindrome.");
              } else {
                  System.out.println(str + " is not a palindrome.");
              }} }
      public static boolean isPalindrome(String str) {
          int left = 0;
          int right = str.length() - 1;
          while (left < right) {
              if (str.charAt(left) != str.charAt(right)) {
                  return false;
              }
              left++;
              right--; }
          return true;
         }
  }
  
  
