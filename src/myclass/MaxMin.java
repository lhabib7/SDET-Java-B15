package myclass;

public class MaxMin {

        public static void main(String[] args)
        {
            int[] value = new int[]{9, 1, 2, 13, 4, 5};
            int max=value[0];
            int min=value[0];

            for (int i = 0; i <value.length ; i++) {
                if (value[i]>max ){max=value[i]; }
                if (value[i]<min ){min=value[i]; }
            }
            System.out.println(max);
            System.out.println(min);
        }
    }

