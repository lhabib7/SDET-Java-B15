package homework;

public class DiplomaStatue {
    public static void main(String[] args) {
        boolean dip=false;
        double gpa=1.5;
        if (dip==true){
            System.out.println("Congratulation");
            if (gpa>=3.5){System.out.println("you are eligible for scholarship");}
            else if (gpa<3.5){System.out.println("You should have studied more");}
        }
        else if (dip==false){
                System.out.println("You should get a degree");
            }
    }
}
