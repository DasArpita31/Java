class Parent1{
    private void display(){
        System.out.println("This is parent class");
    }
}
class Child1 extends Parent1{
    void show(){
        System.out.println("This is child class");
    }
}
public class Inheritance12{
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.display();
        Child1 c = new Child1();
        c.show();
        c.display();
    }
}
