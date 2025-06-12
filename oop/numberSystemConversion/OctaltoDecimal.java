package oop.numberSystemConversion;

public class OctaltoDecimal {
     public static void main(String[] args) {
        
        String octal = "100";
        Integer decimal = Integer.parseInt(octal,8);
        System.out.println(decimal);
    }
}
