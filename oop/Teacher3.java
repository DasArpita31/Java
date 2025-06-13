package oop;

public class Teacher3 {
    public static void main(String[] args) {
        TeacherCon Teacher1 = new TeacherCon("Arpita Das", "female", 045464676);

        Teacher1.displayInformation();
    
        System.out.println();

        TeacherCon Teacher2 = new TeacherCon("Arpon Das","male", 897997890);
        
        Teacher2.displayInformation();
    }
}
