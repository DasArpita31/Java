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
public class Inheritance15 {
   public static void main(String[] args) {
       Square[] squares = new Square[15];

        for (int i = 0; i < 15; i++) {
            squares[i] = new Square(i + 1);
            System.out.println("Square " + (i + 1) + " - Area of Square: " + squares[i].area());
        }
   } 
}
