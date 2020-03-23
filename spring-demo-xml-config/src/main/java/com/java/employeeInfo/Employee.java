package com.java.employeeInfo;

import java.util.List;
public class Employee {
    private String name;
    private Integer age;
    private Double salary;
    private Department department;
    private List<String> taskList;

    public Employee(String name, Integer age, Department department,Double salary, List<String> taskList) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.taskList = taskList;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " : " + age + " : " +department + " : TaskList is as follows : " + taskList + " : Salary : "+salary ;
    }
}
