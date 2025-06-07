package array;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        
        int[] num = {-10,15,38,-18,79};

        Arrays.sort(num);

        System.out.print("Ascending : ");
        for(int i=0;i<5;i++){
            System.out.print(" "+num[i]);
        }

        System.out.println();
        System.out.print("Descending : ");
        for(int i=4;i>=0;i--){
            System.out.print(" "+num[i]);
        }

    }
}
