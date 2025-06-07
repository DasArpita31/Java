package array;

import java.util.ArrayList;

public class ArrayList3 {
     public static void main(String[] args) {

        ArrayList<Integer> number= new ArrayList<>();

        System.out.println("size  = "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        System.out.println("ArrayList contains : "+number);
        System.out.println("size = "+number.size());

        //removing elements
        number.remove(2);
        System.out.println("After removing ArrayList contains :" +number);

        number.removeAll(number);
        System.out.println("After removing all : "+number);

    }
}
