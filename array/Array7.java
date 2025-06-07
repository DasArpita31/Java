package array;

import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        
        String[] name = {"yellow","pink","green"};
        Arrays.sort(name);

        for(int i=0;i<3;i++){
            System.out.print(" "+name[i]);
        }
        System.out.println();
         for(int i=2;i>=0;i--){
            System.out.print(" "+name[i]);
        }
    }
}
