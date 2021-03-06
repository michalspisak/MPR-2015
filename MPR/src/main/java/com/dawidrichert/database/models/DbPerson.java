package com.dawidrichert.database.models;

public class DbPerson implements Indexable {

    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public DbPerson(long id, String firstName, String lastName, String phoneNumber) {
        this(firstName, lastName, phoneNumber);
        this.id = id;
    }

    public DbPerson(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
