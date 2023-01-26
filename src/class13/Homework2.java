package class13;

public class Homework2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
        String text= "Stnacdohp*@#$%&72361243";
        System.out.println(text.replaceAll("[^A-Za-z0-9]","").length());


    }
}
