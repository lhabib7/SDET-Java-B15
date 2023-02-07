package ReplitExercices;


//Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
//( Return false if one or both given numbers are not even)
// bothEven(4,6) ==> true
//- bothEven(3,4) ==> false
//- bothEven(-1,1) ==> false
public class Replit116 {
    int a,b;
    void bothEven(int a,int b){

       if (a%2==0 & b%2==0){
           System.out.println(true);
       }
       else {
           System.out.println(false);
       }
    }

    public static void main(String[] args) {
        Replit116 m=new Replit116();
m.bothEven(4,6);
m.bothEven(3,4);
m.bothEven(-1,1);

    }

}



