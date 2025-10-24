package oop.Inheritance.homework;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals(" ")){
            this.name = name;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary >= 0){
            this.salary = salary;
        }
    }

    
    public void display() {
        System.out.println("Name: " + name + "\n+" + "Salary: " + salary);
    }
    
}
