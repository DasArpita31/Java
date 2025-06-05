package basicjava;

import java.util.Scanner;

public class Unaryop {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        int x=-10;
        int result;
        result = +x;
        System.out.println("Result = "+result);
        result = -x;
        System.out.println("Result = "+result);
    }
}
