package assignment;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int option;
        System.out.print("Enter any option from 1 to 4 : ");
        option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("Bengali");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("Urdu");
                break;
            case 4:
                System.out.println("English");
                break;
            default:
                System.out.println("Sorry! Invalid option. Try again.");
        }

    }
}
