package oop.Inheritance.example;

public class Person {
    private String name;
    private int age;
    private String address;
    
    public Person(String name, int age, String address) {
        setAge(age);
        setName(name);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        if(!name.equals("")){
            this.name = name;
        }
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
    }

    public void setAddress(String address) {
        if(!address.equals("")){
            this.address = address;
        }
    }

    public void display(){
        System.out.println("Name: " + name + "Tuoi: " + age + "Address: " + address);
    }
    
}
