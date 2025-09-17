class Person1{
    private String first;
    private String last;

    Person1(String first,String last){
        this.first=first;
        this.last=last;
    }
    String getFirstName(){
        return first;
    }
    public String getLastName(){
        return last;
    }
}
class Employee1 extends Person1{
    String employeeId;
    String jobTitle;

    Employee1(String first,String last,String employeeId,String jobTitle){
        super(first,last);
        this.employeeId=employeeId;
        this.jobTitle=jobTitle;
    }
    public String getEmployeeId(){
        return this.employeeId;
    }
    @Override
    public String getLastName(){
        return super.getLastName()+"("+jobTitle+")";
    }
}
public class Inheritance7 {
public static void main(String args[]){
    Person1 obj1 = new Person1("Jane", "Doe");
    System.out.println("Person: " + obj1.getFirstName() + " " + obj1.getLastName());

    Employee1 obj2 = new Employee1("John", "Smith", "E456", "Manager");
    System.out.println("Employee: " + obj2.getFirstName() + " " + obj2.getLastName());
    System.out.println("Employee ID: " + obj2.getEmployeeId());
}
}
