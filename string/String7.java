package string;

public class String7 {
    
    public static void main(String[] args) {
        
    
    StringBuilder str = new StringBuilder("Arpita ");

    System.out.println("str = "+str);

    str.append("Das ");
    str.append(25);
    str.append(" "+12.5);

    System.out.println(str);

    str.delete(2, 5);
    System.out.println(str);
    
    str.reverse();
    System.out.println(str);
    }
}
