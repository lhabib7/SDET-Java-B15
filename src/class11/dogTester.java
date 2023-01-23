package class11;

import java.util.Scanner;

public class dogTester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        dog dog1= new dog();
        dog1.bark();
        dog1.sleep();
        dog1.eat();
    }
}
