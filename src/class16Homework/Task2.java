package class16Homework;

public class Task2 {
    //1) Create a method that will take a String as a parameter and returns reversed String. Method should be available
    //    to all classes within your project and accessible by class name.
 public String reversed(String str){
    StringBuilder st=new StringBuilder(str);
       String rst= st.reverse().toString();
        return rst;
    }


    public static void main(String[] args) {
        Task2 mp=new Task2();
        System.out.println(mp.reversed("Tomy"));
    }


}
