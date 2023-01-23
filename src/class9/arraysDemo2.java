package class9;

public class arraysDemo2 {
    public static void main(String[] args) {
        int sum=0;
        int [] numbers={10,20,30,45,50};
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
            sum+=numbers[i];
        }
        System.out.println(sum);

    }
}
