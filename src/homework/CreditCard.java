package homework;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        System.out.println("Do you have a credit card");
        Scanner input=new Scanner(System.in);
        String  cc=input.nextLine();
        if (cc.equals("not")){System.out.println("You should apply for a credit card");}

        else if (cc.equals("yes")){System.out.println("What is the balance on the card");
            int ba=input.nextInt();
            if (ba>1000){
                System.out.println("your balance need to be payed off immediately");}

            else if(ba<1000){System.out.println("you can spend more");}}

         else  { System.out.println("the answer should be yes or not");}

        }

    }

