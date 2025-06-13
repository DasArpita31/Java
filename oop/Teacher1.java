package oop;

public class Teacher1 {
    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        Teacher1.name = "Arpita Das";
        Teacher1.gender="female";
        Teacher1.phone = 1729810000;

        Teacher1.displayInformation();
    
        System.out.println();

        Teacher Teacher2 = new Teacher();
        Teacher2.name = "Arpon Das";
        Teacher2.gender="male";
        Teacher2.phone = 1724692000;
        
        Teacher2.displayInformation();
    }
} 
