package scanner;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String address = scanner.nextLine();
        System.err.print(name + " "  + address);
        scanner.close();
    }
}
