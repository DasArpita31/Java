package basicjava;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float celsius;
        System.out.print("Enter Celsius temperature : ");
        celsius= input.nextFloat();

        float fahrenheit =((9*celsius)/5) +32;
        System.out.println("Temperature in Fahrenheit : "+fahrenheit);

    }
}
