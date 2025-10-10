package oop;

import java.util.Scanner;

public class Account {
    private String id;
    private String name;
    private int balance = 0;
    private static int cnt = 0;
    
    public Account(String name, int balance) {
        this.id = String.format("1%03d", cnt++);
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }

    public static int getCnt() {
        return cnt;
    }

    public void deposit(int amount){
        balance =+ amount;
    }

    public void withdraw(int amount){
        balance =- amount;
    }

    public void display(){
        System.out.print("id: " + id + "\nName: " + name + "\nBalance: " + balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        System.out.printl(account.display());
    }
}
