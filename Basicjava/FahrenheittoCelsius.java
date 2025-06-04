package basicjava;

import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String []args){

        Scanner input =new Scanner(System.in);
        float fahrenheit;
        System.out.print("Enter Fahrenheit temperature : ");
        fahrenheit =input.nextFloat();
        
        float celsius =(5*(fahrenheit-32)/9);
        System.out.println("Temperature in Celsius : "+celsius);

    }
}
