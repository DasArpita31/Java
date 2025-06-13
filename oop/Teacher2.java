package oop;

public class Teacher2 {
    
    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        Teacher1.setInformation("Arpita Das", "female", 045464676);

        Teacher1.displayInformation();
    
        System.out.println();

        Teacher Teacher2 = new Teacher();
        Teacher2.setInformation("Arpon Das","male", 897997890);
        
        Teacher2.displayInformation();
    }
}
