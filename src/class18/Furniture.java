package class18;

public class Furniture {
    String type;
    double price;
    String color;
    Furniture(String type,double price,String color){
        this.type=type;
        this.color=color;
        this.price=price;

    }
    void print(){
        System.out.println(type+" price is "+price+" and color is "+color);
    }
}
