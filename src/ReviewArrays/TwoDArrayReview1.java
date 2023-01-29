package ReviewArrays;

public class TwoDArrayReview1 {
    public static void main(String[] args) {
        int [][] array={{1,2,3},
                     {11,12,13},
                    {22,33,44},
                     {55,607}};
        System.out.println(array.length);  // SOP =4
        System.out.println(array[3].length);// SOP = 2
// getting all the values from array
        for (int[] arr:array){ // iterates over each arrays
            for (int num:arr){ // iterates over each element
            System.out.print(num+" ");}
            System.out.println();
        }
        //using for loop
        for (int row = 0; row<array.length ; row++) {// outer loop iterates over rows
            for (int col = 0; col <array[row].length ; col++) {// iterates over each column
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }

    }
}
