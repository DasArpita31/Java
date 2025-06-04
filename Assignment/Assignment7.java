package basicjava;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you love java?\n Type Y or y for yes and N or n for no");
        char ans;
        ans =input.next().charAt(0);

        if(ans =='y' || ans == 'Y'){
            System.out.println("You are a java lover.");
        }
        else if(ans == 'n' || ans == 'N'){
            System.out.println("You are not a java lover.");
        }
        else
            System.out.println("Wrong type");
    }
}
