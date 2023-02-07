package ReviewObjectAndClass;

public class Flower {
    //attributes ,properties
    String color,type,name;
    int price;
    // behavior
    void smell(){
        System.out.println(name+" "+color+" smells good");
    }
    void bloom(){
        System.out.println(name+" "+color+" flower bloom");
    }
    void grow(){
        System.out.println(name+" "+color+" flower grow");
    }
}
