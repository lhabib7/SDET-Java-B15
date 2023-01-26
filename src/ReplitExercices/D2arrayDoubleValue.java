package ReplitExercices;

public class D2arrayDoubleValue {
    public static void main(String[] args) {
        //Write a program to double the values of every element in the array and print it out.
        double[][] array={{2.8,4.0,6.6,4.0},
                {8.0,3.0,12.2,2.0},
                {2.4,6.2,8.0,3.2}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(2*array[i][j]+" ");
            }
            System.out.println();
        }
    }
}

