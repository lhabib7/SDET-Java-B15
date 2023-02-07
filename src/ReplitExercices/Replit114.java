package ReplitExercices;


//Step1: Create three methods that will accept 2 in parameters on integer type
//Step2: Write the logic in methods to perform actions below:
//The first method for multiplication
//The second method for addition
//The third method for subtraction
//Step3: execute all methods
//1. for the addition method add two numbers to make 30
//2. for multiplication multiply two numbers to make 30
//3. for Subtraction subtract two numbers to equal 20
public class Replit114 {
    void multiplication(){
      int x=6,y=5;
            System.out.println("multiplication "+(x*y));
        }
        void addition()
            { int x=13,y=17;
                System.out.println("Addition "+(x+y));
            }
    void subtraction()
    { int x=41,y=21;
        System.out.println("Subtraction "+(x-y));
    }

    public static void main(String[] args) {
        Replit114 m=new Replit114();
       m.addition();
       m.multiplication();
       m.subtraction();


    }

}



