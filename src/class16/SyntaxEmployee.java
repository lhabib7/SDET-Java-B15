package class16;

public class SyntaxEmployee {
    // Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects
    String empID;
    int Salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee object1=new SyntaxEmployee();
        object1.empID="217";
        object1.Salary=1400;

        SyntaxEmployee object2=new SyntaxEmployee();
        object2.empID="968";
        object2.Salary=960;

        System.out.println(object1.empID);
        System.out.println(object1.Salary);
        System.out.println(object1.CEO);
        System.out.println(object2.empID);
        System.out.println(object2.Salary);
        System.out.println(object2.CEO);
    }
}
