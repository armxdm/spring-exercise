package com.exist.dto;

import java.io.Serializable;

public class AddressDto implements Serializable {

    private int number;
    private String street;
    private String barangay;
    private String city;
    private int zipCode;

    public AddressDto() {
    }

    public AddressDto(int number, String street, String barangay, String city, int zipCode) {
        if (number != 0) {
            this.number = number;
        }
        this.street = street;
        this.barangay = barangay;
        this.city = city;
        if (zipCode != 0) {
            this.zipCode = zipCode;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return number + " " + street + ", " + barangay + ", " + city + ", " + zipCode;
    }

}
