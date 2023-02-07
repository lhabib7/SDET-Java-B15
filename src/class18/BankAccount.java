package class18;

public class BankAccount {// parent or super class
    long AccountNumber;
    double Balance;
    void deposit(){
        System.out.println("Deposit methods from Bank account class");
    }

}
class Checking extends BankAccount {//child class or subclass
    double interest;
    void transfer(){
        System.out.println("Transfer methods from checking class");
    }
}
class supersavings extends Savings{
    double money;
void report(){
    System.out.println("Your S S account report");
}
}
