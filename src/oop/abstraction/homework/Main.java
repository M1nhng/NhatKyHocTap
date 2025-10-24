package oop.abstraction.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new PartTimeEmployee(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
        System.out.println(employee.calculateSalary());

        Employee employee1 = new FullTimeEmployee(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        System.out.println(employee1.calculateSalary());

       
    }
}
