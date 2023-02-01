package class17Homework;

public class Student {

//Write a Student class   that have instance variables name and address.
// Create a constructor that will initialize those variables.
// Print name & address of given  student using displayInfo method.

    String Name;
    String Address;
    Student(String StName,String StAddress){
        Name=StName;
        Address=StAddress;
    }
    void displayInfo(){
        System.out.println("Student name is: "+Name+" Student address is: "+Address);
    }

    public static void main(String[] args) {
        Student student=new Student("Lhabib","36 Jesmeral court ");
        student.displayInfo();
    }

}

