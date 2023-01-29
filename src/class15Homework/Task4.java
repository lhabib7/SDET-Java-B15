package class15Homework;
//Create a method that will say Hello in different language based on the country
public class Task4 {

    String sayHello(String str) {

        switch (str) {
            case "Morocco":
                return "أهلا";
            case "USA":
                return "Hello";
            case "France":
                return "Salut";
            case "italy":
                return "ciao";
            default:
                return "Wrong language";
        }
    }

    public static void main(String[] args) {

        Task4 mp = new Task4();
        System.out.println(mp.sayHello("Morocco"));;
        System.out.println(mp.sayHello("italy"));

    }

}