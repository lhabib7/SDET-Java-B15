package class17Homework;

public class StaticConstructor {


        //Declaring a static constructor
        public  StaticConstructor()
        //  static!!! java: modifier static not allowed here
        {
            System.out.println("There is no static constructor in Java");
        }
        public static void main (String args[])
        {

            StaticConstructor obj = new StaticConstructor();
        }

    }
