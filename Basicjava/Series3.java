package basicjava;

import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter last number : ");
        n = input.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i+"X"+i+" ");
            sum = sum + i*i;
        }
        System.out.println("\nSum = "+sum);
    }
}
