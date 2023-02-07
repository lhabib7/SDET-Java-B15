package ReplitExercices;


//Write a method header on line two with the following specs:
//Returns:
//a String
//Name:
//spaceOut
//Parameters:
//a String
//Then complete the method by programming the following behavior
//Insert spaces after every character in the String s, then return the new string.
//See below examples (note the space at the end as well).
//Examples:
//spaceOut("hello") ==> "h e l l o "
//spaceOut("technology") ==> "t e c h n o l o g y "
public class Replit118 {
    void spaceOut(String s){
        for (int i = 0; i <s.length() ; i++) {
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Replit118 m=new Replit118();
        m.spaceOut("hello");
        m.spaceOut("technology");
    }

}



