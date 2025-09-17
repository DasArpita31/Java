class Point{
    private double x,y;
     public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

}

class Quadrilateral77{
    private Point p1,p2,p3,p4;

    public Quadrilateral77(Point p1,Point p2,Point p3,Point p4){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
    }

    protected Point getP1(){
        return p1;
    }
     protected Point getP2(){
        return p2;
    }
     protected Point getP3(){
        return p3;
    }
     protected Point getP4(){
        return p4;
    }

    protected double distance(Point a,Point b ){
        return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
    }
}
class Trapezoid77 extends Quadrilateral77{
    public Trapezoid77(Point p1,Point p2,Point p3,Point p4){
        super(p1,p2,p3,p4);
    }

    public double area(){
        double base1=distance(getP1(), getP2());
        double base2=distance(getP3(), getP4());
        double height=Math.abs(getP1().getY()-getP3().getY());
        return .5*(base1+base2)*height;
    }
}
class Parallelogram77 extends Trapezoid77{
    public Parallelogram77(Point p1,Point p2,Point p3,Point p4){
        super(p1,p2,p3,p4);
    }
    @Override
    public double area(){
    double base=distance(getP1(), getP2());
    double height=Math.abs(getP1().getY()-getP3().getY());
    return base*height;
    }
}
class Rectangle77 extends Parallelogram77{
    public Rectangle77(Point p1,Point p2,Point p3,Point p4){
        super(p1, p2, p3, p4);
    }
    @Override
    public double area(){
        double length=distance(getP1(), getP2());
        double width=distance(getP2(), getP3());
        return length*width;
    }
}
class Square77 extends Rectangle77{
    public Square77(Point p1,Point p2,Point p3,Point p4){
        super(p1, p2, p3, p4);
    }
    @Override
    public double area(){
        double side = distance(getP1(), getP2());
        return side*side;
    }
    }
public class Problem7 {
    public static void main(String[] args) {
        Trapezoid77 t = new Trapezoid77(new Point(0,0), new Point(6,0),new Point(4,4), new Point(2,4));
        Parallelogram77 p = new Parallelogram77(new Point(0,0), new Point(5,0),new Point(6,4), new Point(1,4));
        Rectangle77 r = new Rectangle77(new Point(0,0), new Point(4,0),new Point(4,3), new Point(0,3));
        Square77 s = new Square77(new Point(0,0), new Point(2,0),new Point(2,2), new Point(0,2));


        System.out.printf("Trapezoid Area: %.2f\n", t.area());
        System.out.printf("Parallelogram Area: %.2f\n", p.area());
        System.out.printf("Rectangle Area: %.2f\n", r.area());
        System.out.printf("Square Area: %.2f\n", s.area());
    }
}
