package oop.abstraction.abstractt;

public class Employee extends Person{
    private int balance;

    public Employee(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
        
    }
    

    @Override
    public void display() {
        System.out.println("name: " + getName() + "\n"
        + "address: " + getAddress()
        + "Balance: " + getBalance());
    }


    public int getBalance() {
        return balance;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


   

}
