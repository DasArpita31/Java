package array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];

        double sum = 0;

        System.out.print("Please enter 5 numbers : ");

        for(int i=0;i<number.length;i++){

            number[i] = input.nextDouble();
        }

       /*  number[0]=input.nextDouble();
        number[1]=input.nextDouble();
        number[2]=input.nextDouble();
        number[3]=input.nextDouble();
        number[4]=input.nextDouble();*/
        for(int i=0;i<number.length;i++){
            sum +=number[i];
        }
        /*sum = number[0] + number[1] + number[2] +number[3] + number[4] ;*/
        System.out.println("Sum = "+sum);
        double average = sum/number.length;
        System.out.println("Average = "+average);


    }
}
