package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        int[] numbers={10,13,20,25,45,50};
        //print odd numbers
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]%2!=0){
                numbers[i]=0;
           }
            }
        System.out.println("After replacing all odd numbers with zeros");
        for (int i = 0; i <numbers.length ; i++){
            System.out.println(numbers[i]);
        }
    }}



