package ReviewArrays;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        // Let's create an array of names using Scanner
        Scanner scan=new Scanner(System.in);
        System.out.println("how many names you want to store");
        int size=scan.nextInt();
        String[] name=new String[size];
        for (int i = 0; i <name.length ; i++) {
            System.out.println("Please enter name");
            name[i]=scan.next();
        }
        //enhanced for loop
        for (String x:name){
            System.out.println(x);
        }
    }
}
