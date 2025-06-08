package basicjava;

import java.util.Scanner;

public class PalindromeNumber {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num = input.nextInt();

        int rem,sum=0,temp;
        temp =num;

        while(temp!=0){
            rem = temp%10;
            sum = (sum*10)+rem;
            temp = temp/10;
        }
        if(num == sum){
            System.out.println("Number is Palindrome");
        }
        else
        System.out.println("Not Palindrome");
    }
}
