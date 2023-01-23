package class6;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num1= imp.nextInt();
        int num2= imp.nextInt();
        int num3=imp.nextInt();
        if (num1>num2&&num2>num3){
            System.out.println(num1 + " is the largest");
        }
        else if (num2>num1&&num3>num2){
            System.out.println(num3 + " is the largest");
        }
        else {
            System.out.println(num2 + " is the largest");
        }
    }
}
