package ReplitExercices;
import java.sql.Array;
import java.util.Scanner;

//Create an array of names that will hold 5 String elements. Names must be taking from a user.
//Print out the first three characters of each element of the array, one per line.
//Note: every array element must be at least 3 characters long.
public class Replit104 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a name number : "+(i+1));
            names[i]= inp.next();
           if (names[i].length()<3){
            System.out.println("array element must be at least 3 characters long");
            break;
            }

            }
        for (String list:names)
             {
                 System.out.println(list.substring(0,3));

        }
        }
    }


