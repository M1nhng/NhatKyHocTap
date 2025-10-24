package oop.abstraction.abstractt;

public abstract class Person {
    private String name;
    private String address;
    public Person(String name, String address) {
        setName(name);
        setAddress(address);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(!name.equals("")){
            this.name = name;
        }
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if(!address.equals("")){
            this.address = address;
        }
    }
    
    public abstract void display();
}
