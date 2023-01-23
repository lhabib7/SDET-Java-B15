package ReplitExercices;
public class Arrays9 {
    public static void main(String[] args) {
        //Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}
        //Print the values so the output should be syntax
        char [] value = new char[11];
        value[0]='s';
        value[1]='a';
        value[2]='y';
        value[3]='b';
        value[4]='n';
        value[5]='c';
        value[6]='t';
        value[7]='d';
        value[8]='a';
        value[9]='e';
        value[10]='x';
        for (int i = 0; i <=10 ; i++) {
            if (i%2==0){
            System.out.print(value[i]);}
        }
    }}

