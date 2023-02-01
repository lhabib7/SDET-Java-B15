package class17Homework;

public class employessTester {
    public static void main(String args[]) {

        employee e1 = new employee("129C","Negan Smith ",27,1200);
       employee e2=new employee();
        e2.emp_id="8924B";
        e2.name="Joseph Alvaro";
        e2.age=33;
        e2.salary=1400;

        e1.display();
        e2.display();

    }
}
