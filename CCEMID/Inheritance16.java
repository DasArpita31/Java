class Shape6{
    void display(){
        System.out.println("This is This is shape");
    }
}

class Rectangle6 extends Shape6{
    void rec(){
        System.out.println("This is rectangular shape");
    }
}
class Square6 extends Rectangle6{
    void squ(){
        System.out.println("Square is a rectangle");
    }
}
class Circlc6 extends Shape6{
    void cir(){
        System.out.println("This is circular shape");
    }
}

public class Inheritance16 {
    public static void main(String[] args) {
        Square6 s =  new Square6();
        s.squ();
        s.rec();
        s.display();
    }
}
