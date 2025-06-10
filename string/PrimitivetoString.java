package string;

public class PrimitivetoString {
    public static void main(String[] args) {
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("s = "+s);

        double j = 100.78;
        String p = Double.toString(j);
        System.out.println("p = "+p);

        boolean b = true;
        String q = Boolean.toString(b);
        System.out.println("q = "+q);

    }
}
