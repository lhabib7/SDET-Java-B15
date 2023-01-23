package ReplitExercices;
public class Arrays3 {
    public static void main(String[] args) {
        //Write a program that creates an array of integers that stores the
        // following  values: 45,78, 12,  67, 55, 89, 23, 77, 88
        //Print only values that stored with even index including 0.
          int[] value=new int[9];
          value[0]=45;
          value[1]=78;
          value[2]=12;
          value[3]=67;
          value[4]=55;
          value[5]=89;
          value[6]=23;
          value[7]=77;
          value[8]=88;
        for (int i = 0; i <9 ; i++) {
            if (i%2==0){
                System.out.println(value[i]);}
            }
        }
    }



