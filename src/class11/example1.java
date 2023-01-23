package class11;

public class example1 {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},
                         {45,55,66},
                         {70,80,90,100,25} };
        //foreach loop to print all the numbers from a 2 D array
    for (int [] arr:matrix){
        for (int number:arr){
            System.out.print(number+" ");
        }
        System.out.println();
    }

    }
}
