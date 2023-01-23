package class10;

public class arrayDemo1 {
    public static void main(String[] args) {
        int[] arr={15,22,33,66,57};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("******");
        for (int number:arr){
            System.out.println(number);
        }
    }

}
