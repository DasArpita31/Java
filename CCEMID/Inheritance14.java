class Rectangle8{
    double length;
    double breadth;
    Rectangle8(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return length*breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
    void show(){
        System.out.println("Area of Rectangle:"+area()+"\nPerimeter of Rectangle:"+perimeter()+"\n");
    }
}
class Square extends Rectangle8{
    Square(double side){
    super(side,side);
    }
    @Override
    double area(){
        return length*length;
    }
    @Override
    double perimeter(){
        return 4*length;
    }
    void display(){
        System.out.println("Area of Square:"+area()+"\nPerimeter of Square:"+perimeter()+"\n");
    }
}
public class Inheritance14 {
   public static void main(String[] args) {
        Rectangle8 r = new Rectangle8(4.5, 3.5);
        r.show();
        Square s = new Square(5.5);
        s.display();
   } 
}
