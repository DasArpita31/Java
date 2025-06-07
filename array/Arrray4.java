package array;

public class Arrray4 {
    public static void main(String[] args) {
        int[][] number = new int[4][5];
        int k=0;

        //assigning the value to the array
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                number[i][j] = k;
                k++;
                System.out.print(" "+number[i][j]);
            }
            System.out.println();
        }
    }
}
