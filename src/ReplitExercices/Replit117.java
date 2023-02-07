package ReplitExercices;


//Create a method with the following specs:
//Returns:
//an integer
//Name:
//sumEvenToX
//Parameters:
//an integer called "x"
//Purpose:
//calculate the sum of the EVEN integers from 1 to x (including x)
//Examples:
//sumEvenToX(5) ==> 6
//sumEvenToX(8) ==> 20
public class Replit117 {
    int x;
    int sum=0;
    void sumEvenToX(int x){
        for (int i = 1; i <=x ; i++) {
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Replit117 m=new Replit117();
        Replit117 m1=new Replit117();
        m.sumEvenToX(5);
        m1.sumEvenToX(8);

    }

}



