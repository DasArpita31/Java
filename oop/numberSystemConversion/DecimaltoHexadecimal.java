package oop.numberSystemConversion;

import java.util.Scanner;

public class DecimaltoHexadecimal {
    public static void main(String[] args) {
        int decimal ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any decimal number : ");
        decimal = input.nextInt();
        String Hexadecimal = Integer.toHexString(decimal);
        System.out.println(Hexadecimal);
    }
}
