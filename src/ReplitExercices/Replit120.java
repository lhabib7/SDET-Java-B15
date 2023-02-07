package ReplitExercices;
//Declare 3 instance variables to hold:
//year, school name and batch #
//Access variables from the main method and assign specific values to them
//Print values of your variables in the following format:
//**Expected Output:**
//I am a student of batch 9 studying at Syntax in the year of 2021

public class Replit120 {
    int year;
    String schoolName;
    int batch;
    void values(){
        System.out.println("I am a student of batch "+batch+" studying at "+schoolName+" in the year of "+year);
        }
    public static void main(String[] args) {
        Replit120 m=new Replit120();
     m.schoolName="Syntax";
     m.batch=9;
     m.year=2021;
m.values();
    }

}



