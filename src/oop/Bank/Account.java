package oop.Bank;

public class Account {
    private String id;
    private String name;
    private int balance = 0;
    private static int cnt = 0;

    public Account(String name, int balance) {
        this.id = String.format("1%03d", cnt++);
        setName(name);
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals("")){
            this.name = name;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Giao dich thanh cong! So du moi: " + this.balance);
        } else {
            System.out.println("Loi! So tien nap vao phai la so duong.");
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Loi! So tien rut phai la so duong.");
        } else if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Giao dich thanh cong! So du moi: " + this.balance);
        } else {
            System.out.println("Giao dich that bai!, so tien can rut phai nho hon so du");
        }
    }

    public void display() {
        System.out.println("--- Thong Tin Tai Khoan ---");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);
    }
}