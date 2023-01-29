package class15Homework;

public class Task1 {
    //1) Create a method that will take 2 parameters as a numbers and prints which number is larger.
   int largest(int a,int b){
       if(a>b) {
           return a;
       } else return b;

   }
    public static void main(String[] args) {
        Task1 l=new  Task1() ;
        System.out.println(l.largest(8,45));
}}
