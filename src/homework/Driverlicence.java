package homework;

import java.util.Scanner;

public class Driverlicence {
    public static void main(String[] args) {
        System.out.println("Enter your age please");
        Scanner input=new Scanner(System.in);
       int age=input.nextInt();
       if (age>=18){
           System.out.println("Dmv will issue a driver licence to you ");
       } else if (age<18) {
           System.out.println("!You should get a learners permit first");

       }
    }
}
