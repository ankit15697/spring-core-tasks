package com.java.employeeInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component(value = "department")
@PropertySource("classpath:employeeProperties.properties")
public class Department {

    @Autowired
    @Value("${departmentName}")
    private String departmentName;
    @Value("${dateFormat}")
    private String pattern;
    @Value("${date}")
    private String currDate;

    private Date createdOn;

    public Department() {

    }

    @Autowired
    public void setCreatedOn() {
        createdOn = StringToDate.parse(pattern, currDate);
    }

    @Override
    public String toString() {
        return  departmentName+ " : created on : "+ createdOn;
    }
}
