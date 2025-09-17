class Employee10{
    String name;
    String address;
    double salary;
    String jobTitle;
    Employee10(String name,String address,double salary,String jobTitle){
        this.name=name;
        this.address=address;
        this.salary=salary;
        this.jobTitle=jobTitle;
    }
    double bonus(){
        return salary*0.1;
    }
    String performanceReport(){
        return "General employee report for "+name;
    }
    void managingProject(){
        System.out.println(name+" is working on company tasks.");
    }
    void Info(){
        System.out.println("Name: "+name+"\nAddress: "+address+"\nSalary: $"+salary+"\nJob Title: "+jobTitle);
    }
}
class Manager extends Employee10{
    Manager(String name,String address,double salary,String jobTitle){
    super(name,address,salary,jobTitle);
    }
    @Override
    double bonus(){
        return salary*0.2;
    }
    @Override
    String performanceReport(){
        return "Manager Report for "+name+": Excellent leadership and planning";
    }
    @Override
    void managingProject(){
        System.out.println(name+" is managing the entire project and leading the team.");
    }
    void ManagerInfo(){
        System.out.println("===Manager===");
        Info();
        System.out.println(performanceReport());
        managingProject();
        System.out.println("Bonus: $"+bonus());
        System.out.println();
    }
    
}
class Developer extends Employee10{
    Developer(String name,String address,double salary,String jobTitle){
        super(name, address, salary, jobTitle);
    }
    @Override
    double bonus(){
        return salary*0.1;
    }
    @Override
    String performanceReport(){
        return "Developer Report for "+name+":Good coding and debugging skills.";
    }
    @Override
    void managingProject(){
        System.out.println(name+" is developing key modules of the project.");
    }
    void DeveloperInfo(){
        System.out.println("===Developer===");
        Info();
        System.out.println(performanceReport());
        managingProject();
        System.out.println("Bonus: $"+bonus());
        System.out.println();
    }
}
class Programmer extends Employee10{
    Programmer(String name,String address,double salary,String jobTitle){
        super(name, address, salary, jobTitle);
    }
    @Override
    double bonus(){
        return salary*0.08;
    }
    @Override
    String performanceReport(){
        return "Programmer Report for "+name+": Efficient in writing clean code.";
    }
    @Override
    void managingProject(){
        System.out.println(name+" is writing and testing for assigned tasks.");
    }
    void ProgrammerInfo(){
        System.out.println("===Programmer===");
        Info();
        System.out.println(performanceReport());
        managingProject();
        System.out.println("Bonus: $"+bonus());
        System.out.println();
    }
}
public class Inheritance10 {
    public static void main(String Args[]){
        Manager m = new Manager("Alice", "123 Business Rd", 90000.0, "Manager");
        m.ManagerInfo();
        Developer d = new Developer("Bob","456 Code Ave", 75000.0, "Developer");
        d.DeveloperInfo();
        Programmer p = new Programmer("Charlie", "789 Dev Blvd",65000.0 , "Programmer");
        p.ProgrammerInfo();
    }
}
