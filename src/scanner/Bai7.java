package scanner;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char c = a.charAt(0);
        System.out.println((char)(c + 1));
        scanner.close();
    }
}
