package basicjava;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.err.print("Enter any number : ");
        num = input.nextInt();

        int temp,rem,sum=0;
        temp=num;
        while(temp!=0){
        rem = temp%10;
        sum=sum+rem;
        temp=temp/10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
