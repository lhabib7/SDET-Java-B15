package class18;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount();
        ba.AccountNumber=739652124l;
        ba.Balance=65823;
        ba.deposit();
        System.out.println(ba.AccountNumber);
        System.out.println(ba.Balance);
        System.out.println("*****  Checking Account *****");
        Checking ca=new Checking();
        ca.AccountNumber=7964123l;
        ca.Balance=135698;
        ca.interest=4.9;
        ca.deposit();
        ca.transfer();
        System.out.println("------------Saving account-----------");
        Savings sa=new Savings();
        sa.AccountNumber=9521745265l;
        sa.Balance=96325;
        sa.profit=100;
        sa.deposit();
        sa.takeProfit();
        System.out.println("-----SuperSaving account---------");
        supersavings ssa=new supersavings();
        ssa.report();
        ssa.AccountNumber=51635879l;
        ssa.Balance=1500;
        ssa.money=180;
        ssa.takeProfit();
        ssa.profit=6;
    }
}
class Savings extends BankAccount{
    double profit;
    void takeProfit(){
        System.out.println(" your profit is "+profit);
    }
}


