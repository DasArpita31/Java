class Vehicle3{
    String make;
    String model;
    int year;
    String fuel;
    Vehicle3(String make,String model,int year,String fuel){
        this.make=make;
        this.model=model;
        this.year=year;
        this.fuel=fuel;
    }
    double fuelEfficiency(){
        return 0.0;
    }
    double distance(double litre){
        return litre*fuelEfficiency();
    }
    double maxSpeed(){
        return 0.0;
    }
    void Info(){
        System.out.println("Make: "+make+", Model: "+model+", Year: "+year+", Fuel: "+fuel);
    }
}
class Truck extends Vehicle3{
   Truck(String make,String model,int year,String fuel){
    super(make, model, year, fuel);
   }

   @Override
   double fuelEfficiency(){
    return 6.0;
   }
   @Override
   double maxSpeed(){
    return 110.0;
   }
   void TruckInfo(){
        System.out.println("===Truck Info===");
        Info();
        System.out.println("Fuel Efficiency: "+fuelEfficiency()+" km/l");
        System.out.println("Distance for 40L: "+distance(40)+" km/l");
        System.out.println("Max Speed: "+maxSpeed()+" km/h");
        System.out.println();
    }

}
class Car3 extends Vehicle3{
    Car3(String make,String model,int year,String fuel){
        super(make, model, year, fuel);
    }
    @Override
    double fuelEfficiency(){
        return 18.0;
    }
    @Override
    double maxSpeed(){
        return 190.0;
    }
    void CarInfo(){
        System.out.println("===Car Info===");
        Info();
        System.out.println("Fuel Efficiency: "+fuelEfficiency()+" km/l");
        System.out.println("Distance for 40L: "+distance(40)+" km/l");
        System.out.println("Max Speed: "+maxSpeed()+" km/h");
        System.out.println();
    }
}
class Motorcycle extends Vehicle3{
    Motorcycle(String make,String model,int year,String fuel){
        super(make, model, year, fuel);
    }
    @Override 
    double fuelEfficiency(){
        return 40.0;
    }
    @Override
    double maxSpeed(){
        return 150.0;
    }
    void MOtorcycleInfo(){
        System.out.println("===Motorcycle Info===");
        Info();
        System.out.println("Fuel Efficiency: "+fuelEfficiency()+" km/l");
        System.out.println("Distance for 10L: "+distance(10)+" km/l");
        System.out.println("Max Speed: "+maxSpeed()+" km/h");
        System.out.println();
    }

}
public class Inheritance9 {
    public static void main(String[] args) {
        Truck t = new Truck("Scania", "R-Series", 2021,"Diesel");
        t.TruckInfo();
        Car3 c = new Car3("Honda", "Civic", 2023, "Petrol");
        c.CarInfo();
        Motorcycle m = new Motorcycle("Suzuki", "Gixxer", 2022, "Petrol");
        m.MOtorcycleInfo();
    }
}
