package assignment;

import java.util.Scanner;

public class Assignment14 {
   public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("start number: ");
      int m = input.nextInt();

      System.out.print("end number: ");
      int n = input.nextInt();
      int i,rem,temp;
      int totalPalindromeNumber=0;
        System.out.print("Palindrome numbers are : ");
        for(i=m;i<=n;i++){
        int sum=0;
        temp =i;
        while(temp!=0){
            rem = temp%10;
            sum = (sum*10)+rem;
            temp = temp/10;
        }
    if(i>=10 && sum==i){
        System.out.print(i+" ");
        totalPalindromeNumber++;
    }
}
    System.out.println();
     System.out.println("Total Palindrome numbers from "+m +"to "+n + " is: "+totalPalindromeNumber);
    }
  }
}

