package Lab1.HomeTasks;

public class Task1 {
  public static void main(String[] args) {

          int num = 100;
          Integer intObject = num; 
          System.out.println("Autoboxed Integer object: " + intObject);
  
          double decimal = 45.78;
          Double doubleObject = decimal; 
          System.out.println("Autoboxed Double object: " + doubleObject);
  
          char character = 'A';
          Character charObject = character; 
          System.out.println("Autoboxed Character object: " + charObject);

          System.out.println("\nMethods of Integer Wrapper Class:");
          System.out.println("Binary representation of 100: " + Integer.toBinaryString(100));
          System.out.println("Hexadecimal representation of 100: " + Integer.toHexString(100));
          System.out.println("Is 100 a digit? " + Character.isDigit('1'));

          System.out.println("\nMethods of Double Wrapper Class:");
          System.out.println("Is NaN (Not a Number)?: " + Double.isNaN(doubleObject));
          System.out.println("Double value of string '123.45': " + Double.parseDouble("123.45"));
  
          System.out.println("\nMethods of Character Wrapper Class:");
          System.out.println("Is 'A' a letter? " + Character.isLetter(charObject));
          System.out.println("Lowercase of 'A': " + Character.toLowerCase(charObject));
      }
  }
  
  

