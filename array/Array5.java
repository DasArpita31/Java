package array;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] number = new int[4][];
        int k=0;

        for(int i=0;i<4;i++){
            number[i] = new int[i+1];
        }
        for(int row=0;row<4;row++){
            for(int col=0;col<row+1;col++){
                number[row][col] = k;
                k++;
                System.out.print(" "+number[row][col]);
            }
            System.out.println();
        }
    }
}
