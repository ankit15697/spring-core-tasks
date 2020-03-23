package com.java.employeeInfo;

import java.util.Date;
public class Department {
    private String departmentName;
    private Date createdOn;

    public Department(String departmentName, Date createdOn) {
        this.departmentName = departmentName;
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return  departmentName+ " : created on : "+ createdOn;
    }
}
