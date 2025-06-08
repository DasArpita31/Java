package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(23);
        number.add(-3);
        number.add(18);
        number.add(0);
        number.add(2);

        System.out.println("before sorting : "+number);

        // ascending 
        Collections.sort(number);
        System.out.println("after sorting ascending order : "+number);

        //decending
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("after sorting decending order : "+number);
    }
}
