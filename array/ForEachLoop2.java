package array;

public class ForEachLoop2 {
    public static void main(String[] args) {
        int[] num ={10,15,7,89,45,67,37};
        int sum =0;

        for(int x : num){
            System.out.print(x+" ");
            sum+=x;
        }
        System.err.println();
        System.out.println("Sum = "+sum);
    }
}
