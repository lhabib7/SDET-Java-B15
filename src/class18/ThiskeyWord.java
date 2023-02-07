package class18;

public class ThiskeyWord {
    int a,b;
    ThiskeyWord(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void sum(int a,int b){
        System.out.println("Sum of local variables = "+(a+b));
        System.out.println("Sum of instance variables= "+(this.a+this.b));
    }

    public static void main(String[] args) {
        ThiskeyWord obj=new ThiskeyWord(10,20);
        obj.sum(100,200);
    }
}

