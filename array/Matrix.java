package array;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A=new int[3][3];
        int sumofDiagonalElement=0;
        int sumofUpperTringle=0;
        int sumofLowerTringle=0;
        //matrix input
        System.out.println("Enter matrix elements : ");
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                A[row][col] = input.nextInt();          
            }
        }
        //diagonal,upper,lower
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                
                if(row==col){
                    sumofDiagonalElement+=A[row][col];   
                }
                if(row<col){
                    sumofUpperTringle+=A[row][col];
                }
                if(row>col){
                    sumofLowerTringle+=A[row][col];
                }
            }
        }
        System.out.println("Sum of Diagonal Elements : "+sumofDiagonalElement);
        System.out.println("Sum of Upper Elements : "+sumofUpperTringle);
        System.out.println("Sum of Lower Elements : "+sumofLowerTringle);

    }
}
