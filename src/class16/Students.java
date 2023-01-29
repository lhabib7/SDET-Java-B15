package class16;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    String Name;
    static int numberOfStudents;
     String ID;

    public static void main(String[] args) {
        Students obj1=new Students();
     obj1.ID="C456";
     obj1.Name="Naima";
     obj1.numberOfStudents++;
        Students obj2=new Students();
        obj2.ID="R213";
        obj2.Name="Salim";
        obj2.numberOfStudents++;
        Students obj3=new Students();
        obj3.ID="B1907";
        obj3.Name="Lhabib";
        obj3.numberOfStudents++;
        System.out.println(Students.numberOfStudents);
    }
}
