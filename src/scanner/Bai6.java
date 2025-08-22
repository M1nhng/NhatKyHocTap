package scanner;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.printf("In 15 years, age of " + name + " will be " + (age + 15));
        scanner.close();
    }
}
    