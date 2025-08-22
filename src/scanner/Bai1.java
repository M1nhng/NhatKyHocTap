package scanner;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }
}
