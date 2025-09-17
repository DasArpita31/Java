import java.util.Scanner;

public class Pattern16 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    
    for(int i=0;i<row;i++){

        for(int j=0;j<row-i;j++){
            System.out.print(" ");
        }
        int num=1;
        for(int k=0;k<=i;k++){
            System.out.print(num+" ");
            num=num*(i-k)/(k+1);
        }
        System.out.println();
    }
   } 
}
