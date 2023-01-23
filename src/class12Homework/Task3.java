package class12Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write a program that reads two people's first names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the mom's first name");
        String mom=input.next();
        System.out.println("Please enter the dad's first name");
        String dad=input.next();
        System.out.println("Boy or Girl?");
        String baby=input.next();
        if (baby.equalsIgnoreCase("boy")){
            int i=mom.length();
            System.out.print(dad.substring(0,3).toUpperCase()+mom.substring(i-2,i).toUpperCase());
        }
        else if (baby.equalsIgnoreCase("girl")){
            int i=dad.length();
            System.out.println(mom.substring(0,2).toUpperCase()+dad.substring(i-3,i).toUpperCase());
        }
        else {
            System.out.println("Make sure your entry is correct !!");
        }
        }
    }

