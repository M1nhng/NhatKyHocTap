package oop.abstraction.homework;

public abstract class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        setName(name);
        this.paymentPerHour = paymentPerHour;
    }
    
    @Override
    public String getName() {
       return name;
    }
    public void setName(String name){
        if(!name.equals("")){
            this.name = name;
        }
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }


    public void setPaymentPerHour(int paymentPerHour) {
        if(paymentPerHour > 0){
            this.paymentPerHour = paymentPerHour;
        } else this.paymentPerHour = 0;
    }

}
