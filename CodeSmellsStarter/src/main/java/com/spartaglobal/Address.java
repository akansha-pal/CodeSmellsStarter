package com.spartaglobal;

public class Address {
    public String getStreet;
    public String getTown;
    private int houseNo = 0;
    private String street = "";
    private String town = "";

    public Address(int houseNo, String street, String town) {
        this.houseNo = houseNo;
        this.street = street;
        this.town = town;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }
    public String getAddress() {
        return "Address: " + getAddress().toString();
    }
}
