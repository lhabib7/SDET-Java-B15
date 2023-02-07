package class19HW;public class TestABC {
    public static void main(String[] args) {
        CA a=new CA();
        a.str="from class A";
        a.n=1;
        a.d=19.99;
        a.MethodCA();

        CB b=new CB();
        b.MethodCB();
        b.MethodCA();
        b.printF();

        CC c=new CC();
        c.MethodCC();
        c.MethodCA();
        c.MethodCB();
        c.printF();
}}
