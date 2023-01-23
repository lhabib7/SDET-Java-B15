package class6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {
        Scanner  imp=new Scanner(System.in);
        String day= imp.next();
        if (day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday"))
        {System.out.println("No class today enjoy");}
        else if (day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday"))
        { System.out.println("git class today");}
    else if (day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday")){
            System.out.println("java class");}
    else if (day.equalsIgnoreCase("thursday")){
        System.out.println("review class");}
    else
    {System.out.println("wrong day");}
}}



