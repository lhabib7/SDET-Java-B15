package class15Homework;

public class Task6 {

    String GetGrade(int score) {
        if (score > 90) {
            return "A";
        } else if (score > 80) {
            return "B";
        } else if (score > 70) {
            return "C";
        } else if (score > 50) {
            return "D";
        } else {
            return "F";
        }}
        public static void main(String[] args) {
          Task6 mp=new Task6();
            System.out.println(mp.GetGrade(101));
            System.out.println(mp.GetGrade(49));
    }}