package com.sandy.spring.di.xmlconfig;

public class Employee {

    private int id;
    private String name;
    private int deptId;

    public Employee() {
    }

    public Employee(final int id, final String name, final int deptId) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(final int deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
