package homework;
import java.util.Scanner;
public class class8HW2 {
    public static void main(String[] args) {
        //Create a program that will be asking user to apply for a credit card 10 times.
        // As soon you get an “yes” from a user program should stop asking.
        for (int i = 1; i <=10 ; i++){
            System.out.println(i+"Do you want to apply for a credit card");
            Scanner inp=new Scanner(System.in);
            String text=inp.nextLine();
            // String text=inp.next();
            //if(text.equalIsIgnoreCase(anotherString:"yes")
            if (text.equals("not")) { System.out.println();
               }
                else if  (text.equals("yes")){
               break;}
           }
    }
}