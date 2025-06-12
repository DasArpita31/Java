package oop.numberSystemConversion;

public class BinarytoDecimal {
    public static void main(String[] args) {
        
        String binary = "101010";
        Integer decimal = Integer.parseInt(binary,2);
        System.out.println(decimal);
    }
}
