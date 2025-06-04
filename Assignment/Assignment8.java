package assignment;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int ch1,ch2;
        System.out.println("Have you completed your masters?");
        ch1 =input.next().charAt(0);
        System.out.println("Are you fluent in English?");
        ch2 =input.next().charAt(0);

        if((ch1 =='y' || ch1 =='Y') && (ch2 == 'y' || ch2 == 'Y')){
            System.out.println("You are eligible to for the job interview.");
        }
        else
            System.out.println("You are not eligible to for the job interview.");

    }
}
