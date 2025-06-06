package array;

public class ForEachLoop1 {
    public static void main(String[] args) {
        String[] names= {"Arpita","Arpon","Anik","Arko"};

        System.out.println(names.length);

        for(String x : names){
            System.out.println(x);
        }
       /*  for(int i=0;i<4;i++){
            System.out.println(names[i]);
            }
            */
        
    }
}
