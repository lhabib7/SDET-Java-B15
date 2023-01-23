
package ReplitExercices;


public class NestedForLoops1 {
    public static void main(String[] args) {


        for(int i=0; i<7; i++) // outer loop for rows
        {
            int num=1;
            for(int j=7; j>i; j--) // inner loop for rows
            {
                System.out.print(num+ " ");// printing num with a space
                num++;//incrementing value of num
            }
            System.out.println();// ending line after each row
        }
        for(int i=0; i<=7; i++) // outer loop for rows
        {
            int num=1;
            for(int j=0; j<=i; j++) // inner loop for rows
            {
                System.out.print(num+ " ");
                num++;
            }

            System.out.println();
        }
    }
}

