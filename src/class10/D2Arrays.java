package class10;

import java.util.Arrays;
import java.util.Scanner;

public class D2Arrays {
    public static void main(String[] args) {
    String[] cabin0={"Adam","Mohamed","Nassim"};
    String[] cabin1={"Ayoub","Aicha","Slimane"};
    String[] cabin2={"Mahfoud","Zaina","Fadma"};
    String [][] train=new String[3][3];
    train[0]=cabin0;
    train[1]=cabin1;
    train[2]=cabin2;
        System.out.println(train[1][2]);
        System.out.println(Arrays.toString(train[2]));
        }
    }



