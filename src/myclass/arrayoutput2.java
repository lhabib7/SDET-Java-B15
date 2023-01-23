package myclass;

public class arrayoutput2 {
    public static void main(String s[])
    {
        int[][] input = {{3, 5, 6, 7}, {2, 4}, {1}, {2, 3, 4, 5}};
        int  result = 1;
        int k = 0;

        for(int i = 0; i < input.length; i++)
        {
            for(int j = 0; j < input[k].length; j++)
            {
                result *= input[i][j];
            }
            k++;
        }
        System.out.println("Result = " + result);
    }
}





