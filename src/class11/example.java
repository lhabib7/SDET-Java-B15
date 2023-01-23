package class11;

public class example {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},
                         {45,55,66},
                         {70,80,90,100,25} };
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                //matrix[i].length the size of each 1d array
                if (matrix[i][j]%2!=0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
