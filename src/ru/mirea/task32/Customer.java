package ru.mirea.task30;

public class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Adress address;
    private Customer MATURE_UNKNOWN_CUSTOMER;
    private Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public Customer(String firstName, String secondName, int age, Adress address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Adress getAddress() {
        return address;
    }
}
