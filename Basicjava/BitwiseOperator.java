package basicjava;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int a=32;
        int b=12;

        int c;
        c=a&b;
        System.out.println("a & b ="+c);
        c=a|b;
        System.out.println("a | b ="+c);
        c=a^b;
        System.out.println("a ^ b ="+c);
        c=a>>3;
        System.out.println("a >> 3 ="+c);
        c=a<<3;
        System.out.println("a << 3 ="+c);
    }
}
