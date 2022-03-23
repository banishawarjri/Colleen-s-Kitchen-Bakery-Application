package com.example.coleenskitchenbakeryapp;

public class User
{
    String Name,Id,PhoneNumber,EmailId;

    public User() {
    }

    public User(String name, String id, String phoneNumber, String emailId) {
        Name = name;
        Id = id;
        PhoneNumber = phoneNumber;
        EmailId = emailId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }
}
