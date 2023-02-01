package class17Homework;

public class Students {
    //2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
    //with different marks. Your program should print an average mark of each student's name.
    //NOTE: please use different names for instance and local variables.
    String Name;
    double JavaGrade;
    double SeleniumGrade;
    double CucumberGrade;
    double AverageGrade;

    Students(String StName, double StJavaGrade, double StSeleniumGrade, double StCucumberGrade){
        Name=StName;
        JavaGrade=StJavaGrade;
        SeleniumGrade=StSeleniumGrade;
        CucumberGrade=StCucumberGrade;

        AverageGrade=(StJavaGrade+StSeleniumGrade+StCucumberGrade)/3;
    }
    void printInfo(){
        System.out.println("Student Name: "+Name+" Average Grade :"+AverageGrade);
    }
}
