package ReplitExercices;

import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
       //Write a program that creates a String array with size 7.
        //Ask the user to input Days of a week beginning with Sunday using Scanner class.
        //Add these inputs to your array and then print all values from that array

        String [] days=new  String [7];
      Scanner input=new Scanner(System.in);
        for (int i = 0; i <7 ; i++) {
            System.out.println("Please enter day "+(i+1)+" of the week");
            days[i]= input.next();
        }
        for (int j = 0; j < 7; j++) {
            System.out.println(days[j]);
        }
    }
    }


