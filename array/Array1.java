package array;

public class Array1 {
    public static void main(String[] args) {
        int[] array;
        array =new int[6];

        array[0] = 5;
        array[1] = 6;
        array[2] = 8;
        array[3] = 4;
        array[4] = 9;

        int len = array.length;
        System.out.println("Length of an array : "+len);
        int sum = array[0]+array[1]+array[2]+array[3]+array[4];
        System.out.println("Sum of an array : "+sum);
    }
}
