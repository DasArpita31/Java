package assignment;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Which fibonacci number you want to see? ");
        int n =input.nextInt();
        int first =0;
        int second =1;
        int fibo;

        if(n==0){
            System.out.println(first);
        }
        else if(n==1){
            System.out.println(second);
        }
        else
        {
        for(int i=3;i<=n;i++){
        fibo = first + second;
        first=second;
        second = fibo;
        }
        }
        System.out.println("The "+ n+" th fibonacci number is:"+second);
    }
}
