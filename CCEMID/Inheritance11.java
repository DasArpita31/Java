class Parent{
    void display(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("This is child class");
    }
}
public class Inheritance11 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        Child c = new Child();
        c.show();
        c.display();
    }
}
