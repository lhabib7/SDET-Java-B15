package ReplitExercices;
//declare 3 instance variables to hold an integer, double and char values.
//Create 2 instances of the class and assign values to variables and the print them
//**Expected Output:**
//10
//10.23
//a
//100
//100.23
//s

public class Replit121 {

    void values(int i,double d,char c){
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        }
    public static void main(String[] args) {
        Replit121 m=new Replit121();
        m.values(10,10.23,'a');
        m.values(100,100.23,'s');

    }

}



