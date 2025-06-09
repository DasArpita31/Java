package oop;

public class WrapperClass2 {
    public static void main(String[] args) {
        //object -> primitive

        Integer d = 10;
        System.out.println("d ="+d);

        int e = d;//d.doubleValue() -> unboxing
        System.out.println("e ="+e);
    }
}
