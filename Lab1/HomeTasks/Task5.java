package Lab1.HomeTasks;

public class Task5 {
  public static void main(String[] args) {
    String sent = "Hi my name is Shahzaib Durrani!";
    String[] words = sent.split(" ");
    String longestWord = "";
    int maxLength = 0;

    for (String word : words) {
      if (word.length() > maxLength) {
        longestWord = word;
        maxLength = word.length();
      }
    }
    System.out.println("The longest word is: " + longestWord);
    System.out.println("Length of the longest word: " + maxLength);
  }
}
