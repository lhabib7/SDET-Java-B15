package class19HW;
//Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
//Write program to inherit class A that has method printF which is static and call or reuse that method into class B
public class CA {
    String str;
     int n;
    double d;
    void MethodCA(){
        System.out.println(" Class A method");
    }
  static void printF(){
        System.out.println(" Class A static method ");
    }
}
    class CB extends CA {
       int b;
        void MethodCB(){
            System.out.println("Class B method");
        }
    }
    class CC extends CB{
      char b;
        void MethodCC(){
            System.out.println("Class C method");
        }
}


