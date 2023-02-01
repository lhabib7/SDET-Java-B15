package ReplitExercices;
import java.util.Scanner;
//Write a for loop that will print out the reverse of the string.
public class Replit100 {
    public static String reversed(String s){

        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        System.out.println(reversed(s));

    }
}