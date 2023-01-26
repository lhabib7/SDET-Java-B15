package ReplitExercices;

public class D2arraySumRow {
    public static void main(String[] args) {
        //the sum of elements from each row in a 2D array and adds them into array of integers
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int s=0;
        int s1=0;
        int s2=0;
        int s3=0;
        for (int i = 0; i <a[i].length ; i++) {
            s=s+a[0][i];
            s1=s1+a[1][i];
            s2=s2+a[2][i];
            s3=s3+a[3][i];

        }
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    }


