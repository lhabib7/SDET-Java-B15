package class13;

public class Homework6 {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?
        String s1="Naima";
        String s2="Lhabib";
       s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("After : " + s1+ " " + s2);
    }
}
