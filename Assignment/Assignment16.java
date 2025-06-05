package assignment;

import java.util.Scanner;

public class Assignment16 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            
         System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

        if (username.equals("arpita") && password.equals("123456")) {
                System.out.println("welcome to the system");
                break;
            } 
            else {
                System.out.println("username/password is incorrect. Please try again");
            }
        }
    }
}
