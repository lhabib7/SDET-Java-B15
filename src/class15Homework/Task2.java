package class15Homework;

public class Task2 {
   // Create a method that will take a number and prints whether the number is even or odd.
    boolean EvenOrOdd(int n){
        if (n%2==0){
            return true;
        }else return false;

    }
    public static void main(String[] args) {
        Task2 num=new Task2();
        System.out.println(num.EvenOrOdd(15));
        System.out.println(num.EvenOrOdd(24));
}}
