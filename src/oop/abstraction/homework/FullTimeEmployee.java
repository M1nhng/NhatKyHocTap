package oop.abstraction.homework;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int PartTimeEmployee){
        super(name, PartTimeEmployee);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }

}
