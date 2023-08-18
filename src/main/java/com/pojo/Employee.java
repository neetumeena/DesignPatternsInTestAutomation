package com.pojo;

public class Employee {

    private String name;
    private String address;
    private String id;
    private boolean isContractor;

    public Employee(String name, String address, String id, boolean isContractor) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.isContractor = isContractor;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public boolean isContractor() {
        return isContractor;
    }
}
