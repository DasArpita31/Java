class Animal1{
    public void move(){
        System.out.println("Animal is moving");
    }
}
class Cheetah extends Animal1{
    @Override
    public void move(){
        System.out.println("Running");
    }
}
public class Inheritance6 {
    public static void main(String[] args) {
        Animal1 obj = new Animal1();
        obj.move();
        Cheetah obj2 = new Cheetah();
        obj2.move();
    }
}
