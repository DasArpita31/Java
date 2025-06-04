package assignment;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        

    Scanner input = new Scanner(System.in);
    int m,n,sum=0;
    System.out.print("Enter first number : ");
    m=input.nextInt();
    System.out.print("Enter second number : ");
    n=input.nextInt();

    for(int i=m;i<=n;i+=2){
        if(m%2!=0){
            sum+=i;
        }
    }
        System.out.println("Sum of odd numbers : "+sum);
    }
}

