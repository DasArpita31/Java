package basicjava;

import java.util.Scanner;

public class Series4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            int n;
            System.out.print("Enter last number : ");
            n = input.nextInt();
            int mul =1;
        for(int i=1;i<= n;i++){
            mul *=i;

        }
    System.out.println("Mul = "+mul);
    }
}
