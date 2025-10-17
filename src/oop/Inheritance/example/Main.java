package oop.Inheritance.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
        Teacher teacher = new Teacher(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));

        student.display();
        teacher.display();

        Person p;
        
        p = new Student(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
        p.display();

        p = new Student(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine(),
            Double.parseDouble(scanner.nextLine()));
        p.display();

        scanner.close();
    }
}
