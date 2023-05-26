package com.spartaglobal;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private Address address;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }


    public Person() { }

    public Person(String fName, String lName)
    {
        this.firstName = fName;
        this.lastName = lName;
    }
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }
    public Person(String fName, String lName, int hNo, String street, String town) {
        this(fName, lName);
        this.address = new Address(hNo, street, town);

    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String move() {
        return "Walking along";

    }

    public String move(int times) {
        return "Walking along " + times + " times";
    }

    @Override
    public  String toString() {
    return super.toString() + " Name: " + getFullName() + " Age: " + age + ". " + getAddress();
}

    public String getAddress() {
        return "Address: " + address.getHouseNo() + " " + address.getStreet() + ", " + address.getTown();
    }

}