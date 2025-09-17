class Shape30{
    void show(){
System.out.println("Show");
    }
    void getinfo(){
        System.out.println("Shape");
    }
}
class Circle30 extends Shape30{
    @Override
    void show(){
        System.out.println("Circle");
    }
}
class Rectangle30 extends Shape30{
    @Override
    void show(){
        System.out.println("Rectangle");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {

        Shape30 s = new Circle30();
        s.show();
        s.getinfo();

        Shape30 r = new Rectangle30();
        r.show();
        r.getinfo();

    }
}
