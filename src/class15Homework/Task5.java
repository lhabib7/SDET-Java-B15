package class15Homework;

public class Task5 {
    // Write a method to return whether given number is prime or not?
    boolean isPrime (int num1){
        if (num1 <= 1) {
            return false;
        }
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
  Task5 mp=new Task5();
        System.out.println(mp.isPrime(3));
        System.out.println(mp.isPrime(24));

}
}
