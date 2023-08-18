package com.pojo;

public class EmployeeBuilder {

    private String name;
    private String address;
    private String id;
    private boolean isContractor;

    private EmployeeBuilder() {
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder and() {
        return this;
    }

    public EmployeeBuilder with() {
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setContractor(boolean contractor) {
        isContractor = contractor;
        return this;
    }

    public Employee build() {
        return new Employee(name, address, id, isContractor);
    }
}
