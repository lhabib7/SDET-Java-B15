package ReplitExercices;
//For you to do:
//Declare 3 instance variables to hold:
//- name of the country
//- capital
//- population size
//Create a method to display values of instance variables
//Create 2 Object, assign values to instance variables, execute method display;
//**Expected Output:**
//The capital of USA is Washington DC and population is 330000000
//The capital of Kazakhstan is Astana and population is 18500000

public class Replit122 {

    void values(String country,String capital,int size){
        System.out.println("The capital of "+country+" is "+capital+" and population is "+size);
        }
    public static void main(String[] args) {
        Replit122 m=new Replit122();
      m.values("USA","Washington DC ",330000000);
        m.values("Kazakhstan","Astana ",18500000);
    }

}



