package com.java.employeeInfo;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component(value = "stringToDate")
public class StringToDate {
    public  static Date parse(String pattern, String currentDate) {
        Date parseDate= null;
        try {
            parseDate = new SimpleDateFormat(pattern).parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;
    }
}
