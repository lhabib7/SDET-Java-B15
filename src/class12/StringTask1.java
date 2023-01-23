package class12;
import java.util.Scanner;
public class StringTask1 {
    public static void main(String[] args) {
//Store username, password and confirm password from a user and check following requirements:
//Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//Password should be minimum 8 characters, if less → message=”Password is too short”.
//Password cannot contain username if so, → message=”Password cannot contain username”.
//Password should match confirmed password, if not  → message=“Passwords do not match”.
        String username="Bouvain7";
        String  password="Bl654321";
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your username");
        String un= input.next();
        System.out.println("Please enter your password");
        String pw= input.next();

        if (un.isEmpty()||pw.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        } else if (pw.length()<8){
                System.out.println("Password is too short");
        }else if (pw.contains(un)){
            System.out.println("Password cannot contain username");
        }else if (!un.equals(username)){
            System.out.println("Password do not match");
        }else System.out.println("you are in");
    }}
