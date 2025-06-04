package basicjava;

import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        int id,price;
        String title,description,catagory;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = input.nextInt();
        input.nextLine();
     
        System.out.print("Enter title: ");
        title = input.nextLine();
  
        System.out.print("Enter price: ");
        price = input.nextInt();
        input.nextLine();
  
        System.out.print("Enter description: ");
        description = input.nextLine();

        System.out.print("Enter catagory: ");
        catagory = input.nextLine();

        System.out.println("---Product Info ---");
        System.out.println("ID = "+id);
        System.out.println("Title = "+title);
        System.out.println("Price = "+price);
        System.out.println("Description = "+description);
        System.out.println("Catagory = "+catagory);
        
    }
}