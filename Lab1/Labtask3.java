package Lab1;

public class Labtask3 {
  public static void main(String[] args) {
    
          // Initializing five different strings
          String str1 = "Hello";
          String str2 = "my";
          String str3 = "name";
          String str4 = "is";
          String str5 = "Shahzaib Durrani";
  
          // a) Concatenate all five strings
          String conString = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
          System.out.println("Concatenated String: " + conString);
  
          // b) Convert the fourth string to uppercase
          String str4Upper = str4.toUpperCase();
          System.out.println("Fourth string in uppercase: " + str4Upper);
  
          // c) Find the substring from the concatenated string from index 8 onward
          if (conString.length() >= 8) {
              String substringFrom8 = conString.substring(8);
              System.out.println("Substring from index 8 onward: " + substringFrom8);
          } else {
              System.out.println("The concatenated string is too short for a substring starting from index 8.");
          }
      }
}
