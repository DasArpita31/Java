package oop.static_method;

public class StaticMethod2 {

    static int x=10;
    static void display1(){
        System.out.println("I am non static method");
    }
    static void display2(){
        System.out.println(x);
        display1();
        System.out.println("I am static method");
    }
}
 

