class Animal {
    public void makesound(){
    System.out.println("Some generic animal");
    }
}
class Cat extends Animal{
    public void makesound(){
        System.out.println("Meow");
    }
}
public class Inheritance1{
public static void main(String Args[]){
    Animal obj1 = new Animal();
    obj1.makesound();
    Cat obj2 = new Cat();
    obj2.makesound();
    }
}