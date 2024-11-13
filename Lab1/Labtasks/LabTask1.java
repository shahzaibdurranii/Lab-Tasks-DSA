package Lab1.Labtasks;

public class LabTask1 {
  public static void main(String[] args) {
    int n1  = 5;
    Integer n2 = n1;
    System.out.println(n2);

    Integer objInt = 10;
    int unboxInt = objInt;
    System.out.println(unboxInt);

    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println( s1 == s2);

    s1 = s1.intern();
    s2 = s2.intern();

    System.out.println(s1==s2);
  }
  
}
