class Shape20{

    double area(double length,double width){
        return length*width;
    }

    double area(double radius){
        return Math.PI*radius*radius;
    }

}

public class Overloading {
    public static void main(String[] args) {
        Shape20 s = new Shape20();
        System.out.println("Area of rectangle: "+s.area(5.5,6.7));
        System.out.println("Area of circle: "+s.area(5.5));
    }
}
