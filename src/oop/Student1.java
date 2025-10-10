package oop;

import java.util.Scanner;

public class Student1 {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;
    
    public Student1(int id, String name, int age, String address, int score) {
        // this.id = id;
        // this.name = name;
        // this.age = age;
        // this.address = address;
        // this.score = score;

        //dong goi, an dau du lieu
        setId(id);
        setName(name);
        setAge(age);
        setAddress(address);
        setScore(score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0)
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals("")) this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(!address.equals("")) this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score >=0 && score <= 10) this.score = score;
    }

    @Override
    public String toString(){
        return "Id: " + id + "\nName: " + name + "\nage: " + age + "\nAddress: " + address + "\nScore: " + score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();
        String address = scanner.nextLine();
        int score = scanner.nextInt();

        Student1 s = new Student1(id, name, age, address, score);
        System.out.println(s);
    }
}
