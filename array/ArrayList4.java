package array;

import java.util.ArrayList;

public class ArrayList4 {
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
       
        boolean check = number.isEmpty();
        System.out.println("ArrayList empty : "+check);

        boolean position = number.contains(30);
        System.out.println("30 is in the List? "+position);

        int pos = number.indexOf(40);
        System.out.println("The index of 40 is : "+pos);

        number.set(3, 50);//replace
        System.out.println("After setting : "+number);

        int x = number.get(0);
        System.out.println("index 0 = "+x);

    }
}
