
package ReplitExercices;
import java.util.Scanner;

public class Forloop2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();

        for(int i=number-1;i>=0 ; i--){
            System.out.print(i+" ");
        }
    }}

