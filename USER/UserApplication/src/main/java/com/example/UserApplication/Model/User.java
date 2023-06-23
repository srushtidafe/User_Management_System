package com.example.UserApplication.Model;



public class User {
    private String userId;
    private String name;
    private String userName;
    private String address;
    private String phoneNo;

    public User(String userId, String name, String userName, String address, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

