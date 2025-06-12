package basicjava;

public class IncremementDecrement {
    
    public static void main(String[] args){

        int x=25;
        int y;

        y=--x;
        System.out.println("y = "+y);
         y=x--;
        System.out.println("y = "+y);
         y=++x;
        System.out.println("y = "+y);
         y=x++;
        System.out.println("y = "+y);
    }
}
