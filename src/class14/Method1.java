package class14;

public class Method1 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 45, 50};
        int[] array2 = {23, 207, 55, 3, 17};
        int[] array3 = {1, 2, 3, 4, 5};
       /* int sum=0;
        for (int number:array1){
            sum+=number;
        }
        System.out.println(sum);*/
        AddArrayElements(array1);
      AddArrayElements(array2);
      AddArrayElements(array3);
    }
        static void AddArrayElements(int [] arr){
            int sum=0;
            for (int number:arr){
                sum+=number;
            }
            System.out.println(sum);
        }
    }

