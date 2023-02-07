package ReplitExercices;
//Declare static variable in class level as below and assign its value:
//String ss="Welcome To Syntax Technologies"
//Access variable in the main method and print it using three ways you learned so far
//Hint:
//first way: By calling directly
//Second way: By using the className
//Third way: By creating the object of the class
//**Expected Output:**
//Welcome To Syntax Technologies
//Welcome To Syntax Technologies
//Welcome To Syntax Technologiesll
public class Replit124 {
    static String ss="Welcome To Syntax Technologies";
    void con(){
        System.out.println(ss);
    }
    public static void main(String[] args) {
        System.out.println(ss);
        System.out.println( Replit124.ss);
        Replit124 obj=new   Replit124();
               obj.con();
    }
}
