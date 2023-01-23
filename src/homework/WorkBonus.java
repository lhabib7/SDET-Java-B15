package homework;

import java.util.Scanner;

public class WorkBonus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of worked years");
        int num=input.nextInt();
        System.out.println("Enter your annual salary");
        int sal= input.nextInt();
        if (num>=5){
            if (sal>50000){ System.out.println("you are eligible for 5000 bonus");}
                else
            {System.out.println("you are eligible for 3000 bonus");}
        } else {System.out.println("!Sorry you are not eligible for a bonus");}

        }}
