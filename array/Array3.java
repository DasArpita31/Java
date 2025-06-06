package array;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];

        double sum = 0;

        System.out.print("Please enter 5 numbers : ");

        for(int i=0;i<number.length;i++){

            number[i] = input.nextDouble();
        }
         for(int i=0;i<number.length;i++){
            sum +=number[i];
        }
        System.out.println("Sum = "+sum);
        double average = sum/number.length;
        System.out.println("Average = "+average);
        double max = number[0];
        double min = number[0];
        
        for(int i=1;i<number.length;i++){
            if(max<number[i])
            max = number[i];
    
            if(min>number[i])
            min = number[i];
        }
        System.out.println("The maximum number is : "+max);
        System.out.println("The minimum number is : "+min);
    }
}
