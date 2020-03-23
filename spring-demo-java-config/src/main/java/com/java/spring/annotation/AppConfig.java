package com.java.spring.annotation;

import com.java.employeeInfo.Department;
import com.java.employeeInfo.Employee;
import com.java.employeeInfo.StringToDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import java.util.LinkedList;
import java.util.List;

@Configuration
@PropertySource("classpath:employeeProperties.properties")
public class AppConfig {
    @Value("${name}")
    private String name;
    @Value("${departmentName}")
    private String departmentName;
    @Value("${dateFormat}")
    private String dateFormat;
    @Value("${date}")
    private String date;
    @Value("${salary}")
    private String salary;
    @Value("${age}")
    private String age;
    @Value("${list1}")
    private String list1;
    @Value("${list2}")
    private String list2;
    @Value("${list3}")
    private String list3;
    public AppConfig() {
    }
    @Bean(name="employee")
    public Employee getEmployee(@Autowired Department department) {
      return createEmployee(department);
    }
    private Employee createEmployee(Department department) {
        return new Employee(name, Integer.valueOf(age), department, Double.valueOf(salary), getList());
    }
    @Bean
    public Department getDepartment() {
        return new Department(departmentName, StringToDate.parse(dateFormat, date));
    }
    private List<String> getList() {
        List<String> list = new LinkedList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        return list;
    }
 }
