package class20;

public class BaseClass {
    String name="John";
    void hello(){
        System.out.println("Hello method from base class");
    }
}
class Child extends BaseClass{
    String name="James";
    void callMe(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
  Child nc=new Child();
  nc.callMe();
    }
    }