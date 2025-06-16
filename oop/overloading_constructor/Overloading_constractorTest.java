package oop.overloading_constructor;

public class Overloading_constractorTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Anis","male");
        teacher2.displayinformation();

        Teacher teacher3 = new Teacher("Arpita","female",01346452);
        teacher3.displayinformation();

    }
}
