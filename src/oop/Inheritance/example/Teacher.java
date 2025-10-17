package oop.Inheritance.example;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        setAddress(address);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary > 0){
            this.salary = salary;
        }
    }

    @Override 
    public void display(){
        super.display();
        System.out.print(salary);
    }
    
}
