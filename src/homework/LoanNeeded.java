package homework;

import java.util.Scanner;

public class LoanNeeded {
    public static void main(String[] args) {
        System.out.println("What is the amount of loan needed");
        Scanner input=new Scanner(System.in);
        double amount= input.nextDouble();

        if (amount<=200000){
            System.out.println("Congrats Your Loan is approved");
        } else if (amount>200000) { System.out.println("!!Sorry Your request was denied");
        }
        input.close();
    }
}
