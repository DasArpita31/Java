package oop.overloading_constructor;

public class Teacher {

    String name,gender;
    int phone;

    Teacher(){
        System.out.println("No information");
    }
    Teacher(String n,String g){
        name = n;
        gender = g;
    }
    Teacher(String n,String g,int p){
        name = n;
        gender = g;
        phone = p;

    }
    void displayinformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender :"+gender);
        System.err.println("Phone :"+phone);
    }
}
