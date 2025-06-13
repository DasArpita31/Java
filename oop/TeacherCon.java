package oop;

public class TeacherCon {
     String name,gender;
    int phone;

        TeacherCon(){
            System.out.println("No value");
        }
        TeacherCon(String n,String g,int p){
            name = n;
            gender = g;
            phone = p;
        }

    void displayInformation(){
    System.out.println("Name = "+name);
    System.out.println("Gender = "+gender);
    System.out.println("Phone = "+phone);
    } 
}
