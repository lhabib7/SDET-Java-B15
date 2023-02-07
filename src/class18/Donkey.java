package class18;

public class Donkey {
    String name;
    int age;
  //  Donkey(){ System.out.println("a non argument constructor"); }
  Donkey(String donName,int donAge){
      name=donName;
      age=donAge;
  }

    void print(){
        System.out.println("donkey's name is "+name+" and his age is "+age);
    }

    public static void main(String[] args) {
       Donkey donkey= new Donkey("Josephine",5);
       donkey.print();
    }
}
