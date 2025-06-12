package oop.numberSystemConversion;

public class HexadecimaltoDecimal {
     public static void main(String[] args) {
        
        String Hexadecimal = "ABCD";
        Integer decimal = Integer.parseInt(Hexadecimal,16);
        System.out.println(decimal);
    }
}
