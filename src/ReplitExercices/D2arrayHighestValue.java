package ReplitExercices;

public class D2arrayHighestValue {
    public static void main(String[] args) {
        //Write a program that prints the highest value in the array.
        int[] numbers= {5,4,8};
        int x=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if (x<numbers[i]){
                x=numbers[i];
            }
            }
        System.out.println("The highest value in the array is "+x);
        }
    }


