package com.java.employeeInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component(value = "employee")
@PropertySource("classpath:employeeProperties.properties")
public class Employee {
    @Autowired
    @Value("${name}")
    private String name;
    @Autowired
    @Value("${age}")
    private Integer age;
    @Autowired
    @Value("${salary}")
    private Double salary;
    @Value("${list1}")
    private String list1;
    @Value("${list2}")
    private String list2;
    @Value("${list3}")
    private  String list3;
    private List<String> taskList;
    @Autowired(required = true)
    private Department department;


    public Employee() {

    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Autowired
    public void setTaskList() {
       List<String> list = new LinkedList<String>();
       list.add(list1);
       list.add(list2);
       list.add(list3);
       this.taskList = list;
    }

    @Override
    public String toString() {
        return name + " : " + age + " : " +department + " : TaskList is as follows : " + taskList + " : Salary : "+salary ;
    }
}
