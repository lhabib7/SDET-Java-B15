package class20Homework;
// Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
//Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
//Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.Test your code!
public class Employee {
    String FirstName;
    String LastName;
    String ID;
    int age;
    Employee(String FirstName,String LastName,String ID,int age){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.ID=ID;
        this.age=age;
    }
    void EmployeeInfo(){
        System.out.println("Employee first name is "+FirstName+" last name "+LastName+"ID "+ID+" Age "+age);
    }}
 class FullTime extends Employee{
double hours;
    FullTime(String FirstName, String LastName, String ID, int age,double hours) {
        super(FirstName, LastName, ID, age);
        this.hours=hours;
    }
    void FTE(){
        System.out.println("Full time employee first name is "+FirstName+" last name "+LastName+"ID "+ID+" Age "+age+" Working hours "+hours);
    }
}
class PartTime extends Employee{
    String PhoneNum;
    PartTime(String FirstName, String LastName, String ID, int age,String PhoneNum){
        super(FirstName, LastName, ID, age);
        this.PhoneNum=PhoneNum;
    }
    void PTE(){
        System.out.println("Part time employee first name is "+FirstName+" last name "+LastName+"ID "+ID+" Age "+age+" Phone number "+PhoneNum);
    }
}
 class Tester extends FullTime{
double salary;
    Tester(String FirstName, String LastName, String ID, int age, double hours,double salary) {
        super(FirstName, LastName, ID, age, hours);
        this.salary=salary;
    }
    void test(){
        System.out.println("A tester employee first name is "+FirstName+" last name "+LastName+"ID "+ID+" Age "+age+" salary "+salary);
    }

    public static void main(String[] args) {
        Employee emp=new Employee("James","Negan","763P",49);
        emp.EmployeeInfo();
      FullTime ft=new FullTime("Michel","Fleep","19569R",38,41.0);
        ft.FTE();
        PartTime pt=new PartTime("John","Stevie","9678W",32,"84532657891");
        pt.PTE();
        Tester t=new Tester("Joe","blue","96347V",57,29.00,1400.00);
        t.test();
    }
}