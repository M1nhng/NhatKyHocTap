package vonglap;

import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Integer.max(a, b);
        scanner.close();
    }
}
