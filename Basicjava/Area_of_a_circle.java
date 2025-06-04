package basicjava;

import java.util.Scanner;

public class Area_of_a_circle {
    public static void main(String []args){

        Scanner input =new Scanner(System.in);
            double radius,area;
            System.out.print("Enter radius : ");
            radius =input.nextDouble();
            area= 3.14159*radius*radius;

            System.out.println("Area of a circle = "+area);
     }
}

