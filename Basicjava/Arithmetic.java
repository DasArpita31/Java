package basicjava;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int num1,num2,result;

        Scanner input =new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1=input.nextInt();

         System.out.print("Enter number 2:");
        num2=input.nextInt();

        result=num1+num2;
        System.out.println("Sum = "+result);

        result=num1-num2;
        System.out.println("Sub = "+result);

        result=num1*num2;
        System.out.println("Multiplication = "+result);

          if (num2 != 0) {
        double result2=(double) num1/num2;
        System.out.println("Div = "+result2);

        result=num1%num2;
        System.out.println("Rem = "+result);
          }
          else
          System.out.println("Division and remainder by zero is not allowed.");
    }

}
