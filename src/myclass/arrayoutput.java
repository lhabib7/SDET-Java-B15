package myclass;

public class arrayoutput {
    public static void main(String s[])
    {
        int a[] = new int[50];

        int i = 27 % 11;
        int j = 2 * 2;
        int k = i - j;

        a[i] = j;
        a[j] = i;
        a[k] = k;

        int sum = 0;

        for(int l = 0; l < a.length; l++)
        {
            sum += a[k];
        }
        System.out.println("Sum = " + sum);
    }
}

