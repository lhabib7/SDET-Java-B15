package class16Homework;

public class Task3 {
    // Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    //    Method should be available inside the class only where it was declared and executed by calling it is name.

    private static String StringVowels(String str){
         String res=str.replaceAll("[^aeiou]","");
    return res;
    // return str.replaceAll("[^aeiou]","");
}

    public static void main(String[] args) {
        System.out.println(StringVowels("Java Syntax is complicated"));
    }
}
