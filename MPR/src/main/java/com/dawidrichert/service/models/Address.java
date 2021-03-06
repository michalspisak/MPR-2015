package com.dawidrichert.service.models;

public class Address {

    private long id;
    private String street;
    private String city;
    private String postalCode;
    private String province;
    private String country;

    public Address(long id, String street, String city, String postalCode, String province, String country) {
        this(street, city, postalCode, province, country);
        this.id = id;
    }

    public Address(String street, String city, String postalCode, String province, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
