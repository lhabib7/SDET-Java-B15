package class12Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters,
        // print the character in the middle of the String.For Example String str=hello =>l
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string");
        String text=input.next();
        if (!text.isEmpty()){
            if (text.length()%2!=0 && text.length()>=3){
                System.out.println("the character in the middle of the String is : "+text.charAt(((text.length())/2)));
            }else System.out.println("the String has an even number of characters or has less than 3 characters");
        }



    }
}
