package string;

public class StringtoPrimitive {
    public static void main(String[] args) {
        String s = "32";
        int i = Integer.parseInt(s);
        System.out.println("i = "+i);

        String p = "32";
        double j = Double.parseDouble(p);
        System.out.println("j = "+j);

        String q = "32";
        int k = Integer.valueOf(q);
        System.out.println("k = "+k);

    }
}
