package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+ " years old");
        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("You weight is  "+weight+ " kgs");
        System.out.println("Are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("hungry "+hungry);
        System.out.println("What is your gender");
        char gender=scan.next().charAt(0);
        System.out.println("You gender is  "+gender);*/
        System.out.println("please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("You are full name is "+fullName);

    }
}
