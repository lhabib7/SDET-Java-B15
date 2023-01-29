package class15;

import java.util.Scanner;

public class MethodPracticeTester {
    public static void main(String[] args) {
        MethodsPractice mp=new MethodsPractice();
       boolean isEven= mp.isEven(15);
        System.out.println(isEven);

        isEven= mp.isEven(100);
        System.out.println(isEven);
        isEven=mp.isEven(12);
        System.out.println(isEven);
        isEven=mp.isEven(20);
        System.out.println(isEven);

    }
}
