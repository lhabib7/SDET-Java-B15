package ReplitExercices;
//Write a method header with the following specs:
//Returns:
//a String
//Name:
//censorLetter
//Parameters:
//a String
//a char
//Then complete the method by programming the following behavior
//Replace all instances of given character with a "*" within the given String.
//See below examples.
//Examples:
//censorLetter("computer science",'e') ==> "comput*r sci*nc*"
//censorLetter("trick or treat",'t') ==> "*rick or *rea*"

public class Replit119 {
    void censorLetter(String str,char c){
        System.out.println(str.replace(c,'*'));
        }
    public static void main(String[] args) {
        Replit119 m=new Replit119();
     m.censorLetter("computer science",'e');
     m.censorLetter("trick or treat",'t');
    }

}



