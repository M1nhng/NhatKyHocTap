package oop;

import java.util.Scanner;

public class Student {
    private String code;
    private String name;
    private int birthYear;
    private String address;
    public Student(String code, String name, int birthYear, String address) {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }

    public void output(){
        System.out.print(code + " " + name + " " + birthYear + " " + address);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextLine());
        student1.output();
    }
}
