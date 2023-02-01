package ReplitExercices;

import java.util.Scanner;

public class Replit95 {
    public static void main(String[] args) {
        //Using Scanner class input string value.
        //Print out The first 3 letters of the string, for example "The first 3 letters of banana is ban".
        System.out.println("Please enter a sting");
        Scanner text=new Scanner(System.in);
        String str=text.next();
        System.out.println("The first 3 letters of "+str+" is "+str.substring(0,3));

    }
}
