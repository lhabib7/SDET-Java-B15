package class16Homework;

public class Task3 {
    // Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    //    Method should be available inside the class only where it was declared and executed by calling it is name.

    private String StringVowels(String str){
         String res=str.replaceAll("[^aeiou]","");
    return res;
}

    public static void main(String[] args) {
        Task3 mp=new Task3();
        System.out.println(mp.StringVowels("Java Syntax is complicated"));
    }
}
