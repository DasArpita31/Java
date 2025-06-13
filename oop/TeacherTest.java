package oop;

public class TeacherTest {
     public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        Teacher1.name = "Arpita Das";
        Teacher1.gender="female";
        Teacher1.phone = 1729810000;

        System.out.println("Name : "+Teacher1.name);
        System.out.println("Gender : "+Teacher1.gender);
        System.out.println("Phone : "+Teacher1.phone);
        System.out.println();

        Teacher Teacher2 = new Teacher();
        Teacher2.name = "Arpon Das";
        Teacher2.gender="male";
        Teacher2.phone = 1724692000;
         System.out.println("Name : "+Teacher2.name);
        System.out.println("Gender : "+Teacher2.gender);
        System.out.println("Phone : "+Teacher2.phone);
        
    }
}
