package oop.abstraction.abstractt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        String address = scanner.nextLine();
        Person person = new Employee(name, address, salary);
        person.display();

        int balance = scanner.nextInt();
        scanner.nextLine();
        String name1 = scanner.nextLine();
        String address1 = scanner.nextLine();
        person = new Customer(name1, address1, balance);
        person.display();
    }
    
}
