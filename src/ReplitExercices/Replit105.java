package ReplitExercices;
import java.util.Scanner;

//Write a program that will print out only vowels of a string
public class Replit105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str=inp.next();
        System.out.println(str.replaceAll("[^aeiou]",""));
        }
    }


