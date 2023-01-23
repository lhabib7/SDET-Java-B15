package class12;

public class StringDemo8 {
    public static void main(String[] args) {
    String str="I love Java";
     char c=str.charAt(2);
        System.out.println(c);
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'){counter++;}
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println(counter);

    }
}
