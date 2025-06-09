package string;

public class String1 {
    public static void main(String[] args){

        String s1 = "Arpita das";
        String s2 = new String("arpita das");

        System.err.println("s1 = "+s1);
        System.err.println("s2 = "+s2);

        int len = s2.length();
        System.out.println("Length of s1 = "+len);

        if(s1.equals(s2)){
            System.out.println("Equals");
        }
        else{
        System.out.println("Not equals");
        }
         if(s1.contains("Arpi")){
            System.out.println("Equals");
        }
        else{
        System.out.println("Not equals");
        }
         if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }
        else{
        System.out.println("Not equals");
        }

        boolean con = s1.contains("das");
        System.out.println(con);

        boolean b = s1.isEmpty();
        System.out.println("b= "+b);
    }
}
