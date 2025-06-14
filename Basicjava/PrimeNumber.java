package basicjava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int count=0;
        System.out.print("Enter any positive integer number : ");
        num = input.nextInt();

        if(num ==0 || num ==1){
            System.out.println("Not prime");
        }
        else{
            for(int i=2;i<num/2;i++){
                if(num%i == 0){
                    count++;
                    break;
                }
            }
                if(count ==0){
                    System.out.println("Prime number ");
                }
                else{
                System.out.println("Not prime");
                }
        }

    }
}
