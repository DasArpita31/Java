package oop;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int RandomNumber = rand.nextInt(90)+10;//5 to 10
        System.out.println(RandomNumber);
    }
}
