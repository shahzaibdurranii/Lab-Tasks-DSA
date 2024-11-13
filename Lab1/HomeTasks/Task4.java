package Lab1.HomeTasks;

public class Task4 {
  public static void main(String[] args) {
          String input = "hello world";

          String result = revVowels(input);
          System.out.println("Original string: " + input);
          System.out.println("String with reversed vowels: " + result);
      }
      public static String revVowels(String s) {
          char[] chars = s.toCharArray();
          int left = 0;
          int right = chars.length - 1;
          String vowels = "aeiouAEIOU";
  
          while (left < right) {
              while (left < right && vowels.indexOf(chars[left]) == -1) {
                  left++;
              }

              while (left < right && vowels.indexOf(chars[right]) == -1) {
                  right--;
              }

              if (left < right) {
                  char temp = chars[left];
                  chars[left] = chars[right];
                  chars[right] = temp;
                  left++;
                  right--;
              }
          }
          return new String(chars);
      }
  }
  
  

