package class18;
//Write a Student class  that have instance variables name and address.
// Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.

public class Student {
    String name,address;
    Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+" address is "+address);
    }

    public static void main(String[] args) {
        Student s=new Student("Joe","1389 Madisson ave 10567");
        s.displayInfo();
    }
}
