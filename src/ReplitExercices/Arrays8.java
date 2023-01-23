package ReplitExercices;

import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
       //Create an int array of integers with a size of 5 and input values with Scanner.
        //Don't print prompt questions for a user.
        //Using loop print out each element of the array that should look like the output below x*10
        int [] elm=new  int [5];
      Scanner input=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            elm[i] = input.nextInt();
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(elm[i]*10);
        }
    }
    }


