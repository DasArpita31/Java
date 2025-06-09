package string;

public class String2 {
    public static void main(String[] args) {
        
        String firstname = "Arpita ";
        String lastname = "Das";

        String fullname =firstname + lastname;
        System.out.println("Full name = "+fullname);

        String fullname1 = firstname.concat(lastname);
        System.out.println("Full name = "+fullname1);

        String uppername = fullname.toUpperCase();
        System.out.println("Uppername = "+uppername);

        String lowername = fullname.toLowerCase();
        System.out.println("lowername = "+lowername);

        boolean b = firstname.startsWith("Ar");
        System.out.println("b = "+b);
        
        boolean last = lastname.endsWith("as");
        System.out.println("last = "+last);

        String[] names = {"Anis","Arpita","Arpon"};
        for(int i =0;i<3;i++){
            System.out.println(names[i]);
        }
    }
}
