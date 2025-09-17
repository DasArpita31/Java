class Shape{
    double getArea(){
        System.out.println("Calculating Area in Shape class");
        System.out.print("Generic Shape Area:");
        return 0.0;
    }
}

class Rectangle extends Shape{
    double a;
    double b;
    Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double getArea(){
        System.out.print("Rectangle Area:");
        return a*b;

    }
}
public class Inheritance3 {
    public static void main(String Args[]){
        Shape obj1 = new Shape();
        System.out.println(obj1.getArea());
        Rectangle obj2 = new Rectangle(4.5, 3.5);
        System.out.println(obj2.getArea());
    }
}
