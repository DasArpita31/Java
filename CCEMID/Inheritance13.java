class Member{
    String name;
    int age;
    long phoneNumber;
    String address;
    double salary;

    void printSalary(){
        System.out.println("Salary: "+salary);
    }
}
class Employee5 extends Member{
    String specialization;

}
class Manager5 extends Member{
    String department;
}

public class Inheritance13 {
    public static void main(String[] args) {
       Employee5 m = new Employee5();
       m.name = "Arpita Das";
       m.age = 21;
       m.phoneNumber = 17772903;
       m.address = "Barisal";
       m.salary = 25000.0;
       m.specialization = "Software Development";

       System.out.println("Name: "+m.name);
       System.out.println("Age: "+m.age);
       System.out.println("Phone Number: "+m.phoneNumber);
       System.out.println("Address: "+m.address);
       System.out.println("Specialization: "+m.specialization);
       m.printSalary();

       Manager5 n = new Manager5();
       n.name="Arpon Das";
       n.age = 11;
       n.phoneNumber = 17902903;
       n.address = "Barisal";
       n.salary =20000.0;
       n.department = "CSE";

       System.out.println();

       System.out.println("Name: "+n.name);
       System.out.println("Age: "+n.age);
       System.out.println("Phone Number: "+n.phoneNumber);
       System.out.println("Address: "+n.address);
       System.out.println("Department: "+n.department);
       n.printSalary();
    }
}
