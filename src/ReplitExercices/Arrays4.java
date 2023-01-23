package ReplitExercices;
public class Arrays4 {
    public static void main(String[] args) {
        //Using the following array.
        //{45, 78, 12,  67, 55, 89, 23, 77, 88}
        //Create a for loop to extract values from that array so your output looks as below
        // 78 55 77
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
        for (int i = 1; i <9; i+=3) {

                System.out.println(value[i]);}
            }
        }




