package assignment;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] weekdays ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("Enter day number(1-7) : ");
        int n=input.nextInt();

        for(int i=0;i<weekdays.length;i++){

            if(i==n-1){
                System.out.println(weekdays[n-1]);
            }
        }
    }
}
