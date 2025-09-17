class Shape1{
    double getPerimeter(){
        System.out.println("Calculating perimeter in Shape class");
        return 0.0;
    }
    double getArea(){
        System.out.println("Calculating area in Shape class");
        return 0.0;
    }
}
class Circle extends Shape1{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double getPerimeter(){
        double perimeter=2*Math.PI*radius;
            System.out.println("Circle Perimeter: "+perimeter);
            return perimeter;
    }
    @Override
    double getArea() {
        double area = Math.PI*radius*radius;
        System.out.println("Circle Area: "+area);
        return area;
    }
}
public class Inheritance8 {
    public static void main(String[] args) {
        Shape1 obj = new Shape1();
        System.out.println("Generic Shape Perimeter: "+obj.getPerimeter());
        System.out.println("Generic Shape Area "+obj.getArea());
        Circle obj1 = new Circle(5);
        System.out.println();
        obj1.getPerimeter();
        obj1.getArea();

    }
}