package class18;

public class Teacher {
    String name;
    int TeacherId;
    String subject;
    Teacher(String name,int TeacherId){
        this.name=name;
        this.TeacherId=TeacherId;
    }
    Teacher(String name,int TeacherId,String subject){
       // this.name=name;
        //this.TeacherId=TeacherId;
        this(name,TeacherId);
        this.subject=subject;
    }
}
