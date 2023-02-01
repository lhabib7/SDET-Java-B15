package ReplitExercices;

import java.util.Scanner;

public class Replit98 {
    public static void main(String[] args) {
        //Create a String given="Hello Syntax friends".
        //Using String methods from given String create new String "Welcome Syntax family"
        //**Expected Output:** Welcome Syntax family
        String given="Hello Syntax friends";
        String text=given.replaceAll("Hello","Welcome");
        System.out.println(text.replaceAll("friends","family"));
    }
}
