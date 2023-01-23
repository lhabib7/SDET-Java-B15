package ReplitExercices;
public class Arrays1 {
    public static void main(String[] args) {
        //Write a program that creates an array of integers of size 11. Add the years 2010 to
        // 2020 to your array one by one using a for loop and then print all those values.
        int [] numbers = new int[11];
        for (int i = 0; i <=10 ; i++) {
        int year=2010;
        numbers[i]=year+i;
            System.out.println(numbers[i]);
        }
    }}

