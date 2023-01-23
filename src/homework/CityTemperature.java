package homework;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {
        System.out.println("Enter the name of your City");
        Scanner input=new Scanner(System.in);
        String city= input.nextLine();
        System.out.println("Enter the temperature in °F");
        int tem= input.nextInt();
        double c=((tem-32)*0.5556);
        System.out.println("The temperature is "+c+" °C in "+city);
    }
}
