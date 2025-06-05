package basicjava;

import java.util.Scanner;

public class Series5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,result=1;
        System.out.print("Enter last number : ");
        n = input.nextInt();

        for(int i=1;i<=n;i+=2){
            System.out.print(i+" ");
            result *=i;
        }
        System.out.println("\nResult = "+result);

    }
}
