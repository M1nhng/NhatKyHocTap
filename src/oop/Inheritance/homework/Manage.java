package oop.Inheritance.homework;

public class Manage extends Employee {
    private int bonus;

    public Manage(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    
    public void display(){
        super.display();
        System.out.print("Bonus: " + bonus);
    }
}
