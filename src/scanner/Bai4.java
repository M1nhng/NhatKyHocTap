package scanner;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cd = scanner.nextInt();
        int cr = scanner.nextInt();
        System.out.printf("Area = %d + %d" + (cd * cr));
        scanner.close();
    }
}
