package ReviewArrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int a=10;
        int[] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println(arr[2]);
        System.out.println("Size of the array is "+arr.length);
        // to get all values from the array
        for (int an:arr){
            System.out.println(an);
        }
        String[] colors={"black","white","red","purple","blue"};
        for (String list:colors){
            System.out.print(list+" ");
        }
        for (int i = 0; i <colors.length ; i++) {
            System.out.println(colors[i]);

        }
    }
}
