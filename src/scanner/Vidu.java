package scanner;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short a1 = scanner.nextShort();
        short b1 = scanner.nextShort();
        System.out.println("a + b = " + (a1 + b1));
        scanner.close();
    }
}
