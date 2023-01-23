package homework;

public class MortgageInfo {
    public static void main(String[] args) {
        double rate=3.6;
        double price=170000;
        if (rate>4.5){
            System.out.println("I will not buy the house");
        }
        else if (rate<=4.5){System.out.println("I will buy the house");
        if (price>200000){System.out.println("I Need to take a loan");}
        else if (price<=200000){System.out.println("I can pay it cash");}
        }
    }
}
