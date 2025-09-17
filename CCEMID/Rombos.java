import java.util.Scanner;

class Rhombus {
    public void printRhombus(int n) {
        int spaces = n / 2;
        
        // Top half of the rhombus
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int j = 0; j < (2 * i + 1); j++) {
                if (j % 2 == 0) {
                    System.out.print("E");
                } else {
                    System.out.print("F");
                }
            }
            System.out.println();
        }

        spaces = 1;
        // Bottom half of the rhombus
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces++;
            for (int j = 0; j < (2 * i + 1); j++) {
                if (j % 2 == 0) {
                    System.out.print("E");
                } else {
                    System.out.print("F");
                }
            }
            System.out.println();
        }
    }
}

public class Rombos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number for the size of the rhombus: ");
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            Rhombus rhombus = new Rhombus();
            rhombus.printRhombus(n);
        } else {
            System.out.println("Please enter an odd number.");
        }
        scanner.close();
    }
}
