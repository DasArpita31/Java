class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    void work(){
        System.out.println(name+" is working.");
    }
    void getSalary(){
        System.out.println("Salary: $"+salary);
    }
}
class HRManager extends Employee{
    String n;
    HRManager(String name,double salary,String n){
        super(name,salary);
    this.n=n;
    }
    @Override
    void work(){
        System.out.println(name+" is managing HR tasks.");

    }
    void addEmployee(){
        System.out.println(name+" added a new employee: "+n);
        System.out.println("Salary: $"+salary);
    }
}

public class Inheritance4 {
    public static void main(String Args[]){
        Employee obj1 = new Employee("john",50000.0);
        obj1.work();
        obj1.getSalary();
        HRManager obj2 = new HRManager("Alice", 70000.0, "Bob");
        obj2.work();
        obj2.addEmployee();
    }
}
