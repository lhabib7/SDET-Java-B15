package ReplitExercices;
//Create a variable that will hold the count of all instances of the Main class
//Create 3 Object of the class and print value of the count variable;
//**Expected Output:**
//3
public class Replit126 {
    static int count = 0;

    // Instead of performing increment in the constructor
    // instance block is preferred to make this program generic.
    {
        count += 1;
    }
    // various types of constructors
    // that can create objects
    void Replit126()
    {
    }

    public static void main(String args[])
    {
        Replit126 t1 = new Replit126();
        Replit126 t2 = new Replit126();
        Replit126 t3 = new Replit126();

        System.out.println(Replit126.count);
    }
}
