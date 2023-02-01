package class17Homework;

public class employee {
    int  salary,age;
    String emp_id,name;

    employee(String i,String n,int a,int s){
        emp_id = i;
        name = n;
        salary=s;
        age=a;
    }
   employee(){ }


    void display(){System.out.println(emp_id+" "+name+" "+age+" "+salary);}


    }

