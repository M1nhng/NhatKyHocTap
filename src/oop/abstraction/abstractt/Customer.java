package oop.abstraction.abstractt;

public class Customer extends Person {
    private int salary;
    

    public Customer(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }


    @Override
    public void display() {
        System.out.println("name: " + getName() + "\n" 
        + "address: " + getAddress()
        + "salary: " + getSalary());
    }     

    public int getSalary() {
        return salary;
    } 
    
}
