package basicjava;

import java.util.Scanner;

public class input {
    public static void main(String[] args){ 
        Scanner input =new Scanner(System.in);
        String name;
        System.out.println("Enter any string: ");
        name =input.nextLine();
        System.out.println("Welcome :"+name);
    }
}
