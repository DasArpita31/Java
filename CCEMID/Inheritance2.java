class Vehicle{
    public void drive(){
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle{
    public void drive(){
        System.out.println("Repairing a car");
    }
}
public class Inheritance2 {
    public static void main(String Args[]){
        Vehicle obj1 = new Vehicle();
        obj1.drive();
        Car obj2 = new Car();
        obj2.drive();

    }
    
}
