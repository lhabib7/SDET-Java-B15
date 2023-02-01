package class17;

public class Student {
    String name;
    String id;
    int age;
    double weight;
    public Student(String sName,String sId,int sAge,double sWeight){
        id=sId;
        name=sName;
        age=sAge;
        weight=sWeight;

    }
    void printInfo(){
        System.out.println(id+" "+name+" "+age+" "+weight);
    }
}
