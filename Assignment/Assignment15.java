package assignment;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("start number: ");
      int m = input.nextInt();

      System.out.print("end number: ");
      int n = input.nextInt();
      
      int totalArmstrongNumber=0;
        int i,rem,temp;

        System.out.print("Armstrong numbers are : ");
        for(i=m;i<=n;i++){
        int sum=0;
        temp =i;
        while(temp!=0){
            rem = temp%10;
            sum = sum+(rem*rem*rem);
            temp = temp/10;
        }
       if(sum==i){
        System.out.print(i+" ");
        totalArmstrongNumber++;
         }
        }
    System.out.println();
     System.out.println("Total Palindrome numbers from "+m +"to "+n + " is: "+totalArmstrongNumber);
   }
    
  }
}
