package oop.returning_value;

public class Test {
    public static void main(String[] args) {

        ReturningValueDemo ob1 = new ReturningValueDemo();
        int result = ob1.square(7);
        System.out.println("Square of 7 = "+result);
       
        ReturningValueDemo ob2 = new ReturningValueDemo();
        System.out.println("Square of 8 = "+ob2.square(8));
    }
}
