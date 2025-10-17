package oop.Inheritance.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee manage = new Manage(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());

        manage.display();
    }
}
