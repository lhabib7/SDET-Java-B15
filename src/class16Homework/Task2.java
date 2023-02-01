package class16Homework;

public class Task2 {
    //1) Create a method that will take a String as a parameter and returns reversed String. Method should be available
    //    to all classes within your project and accessible by class name.
 public static String reversed(String str){
    /*StringBuilder st=new StringBuilder(str);
       String rst= st.reverse().toString();
        return rst;*/
     return new StringBuilder(str).reverse().toString();
    }


    public static void main(String[] args) {

        System.out.println(reversed("Tomy"));
    }


}
