
package ReplitExercices;
import java.util.Scanner;
public class Forloop1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput=scanner.nextInt();

        for(int i=0;i< userInput*2; i++){
            System.out.print(i+" ");
        }
    }}

