package class13;

public class StringRecap {
    public static void main(String[] args) {
        String str="Java is Great";
        int count=0;
        for (int i = 0; i <str.length(); i++) {
           if(str.charAt(i)=='a') {
               count++;
           }
            System.out.println(str.charAt(i));
        }
        System.out.println(count);
    }
}
