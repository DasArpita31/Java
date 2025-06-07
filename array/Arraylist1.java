package array;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {

        ArrayList<Integer> number= new ArrayList<>();

        System.out.println("size  = "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        System.out.println(number);
        //for each loop
        for(int x : number){
            System.out.print(" "+x);
        }
        System.out.println();
        System.out.println("size = "+number.size());
    }
}
