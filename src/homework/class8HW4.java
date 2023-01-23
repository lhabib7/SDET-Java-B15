package homework;

import java.util.Scanner;

public class class8HW4 {
    public static void main(String[] args) {
        // Write a program to ask a user to enter item they want to buy and the price of that item. Every time user
        // enters money accumulate the amount and tell the user how much is left to pay off. If user give more money
        // program should return a change. Whenever a user done with payments program should say "Thank you for shopping
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter item they want to buy");
        String item=inp.nextLine();
        System.out.println("Please enter the price of this item");
        double price= inp.nextDouble();
        System.out.println("Your total is "+price+"$");
        System.out.println("Please enter money accumulate the amount");
        double amount= inp.nextDouble();
        if (price>amount){
            System.out.println("You still have "+(price-amount)+"$ left to pay off");
        } else if (price<amount){System.out.println("Your change is "+(amount-price)+"$");}
        else  System.out.println("Thank you for shopping");
    }
}
