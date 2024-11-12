package Lab1;

public class LabTask4 {
  public static String mergeAlternately(String word1, String word2) {
    StringBuilder mergedString = new StringBuilder();
    int len1 = word1.length();
    int len2 = word2.length();
    int maxLength = Math.max(len1, len2);
    
    for (int i = 0; i < maxLength; i++) {
        if (i < len1) {
            mergedString.append(word1.charAt(i));
        }
        if (i < len2) {
            mergedString.append(word2.charAt(i));
        }
    }

    return mergedString.toString();
}
  public static void main(String[] args) {
    String word1 = "abc";
        String word2 = "pqr";
        String result = mergeAlternately(word1, word2);
        System.out.println("Merged string: " + result);
  }

}
