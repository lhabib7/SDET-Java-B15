package homework;

import java.util.Scanner;

public class class8HW3 {
    public static void main(String[] args) {
       /* Write a program that reads a range of integers (start and end point), provided
       by a user and then from that range prints the sum of the even and odd integers. */
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a range of integers (start and end point)");
        int int1 = inp.nextInt();
        int int2 = inp.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        if (int1 < int2) {
            for (int i = int1; i <= int2; i++) {
                System.out.println(i);
                if (i % 2 == 0) {
                    sum1 = sum1 + i;
                } else
                    sum2 = sum2 + i;
            }}  else {
            for (int i = int1; i >= int2; i--) {
                System.out.println(i);
                if (i % 2 == 0) {
                    sum1 = sum1 + i;
                } else
                    sum2 = sum2 + i;}
        }System.out.println("the sum of the even numbers is " + sum1);
        System.out.println("the sum of odd numbers is " + sum2);
    }}

