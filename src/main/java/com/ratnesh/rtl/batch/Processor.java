package com.ratnesh.rtl.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.ratnesh.rtl.model.Employee;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Employee, Employee> {

    private static final Map<String, String> DESIGNATION_NAME = new HashMap<>();

    public Processor() {
    	DESIGNATION_NAME.put("SE1", "Software Engineer");
    	DESIGNATION_NAME.put("SE2", "Senior Software Engineer");
    	DESIGNATION_NAME.put("SE3", "Technology Lead");
    	DESIGNATION_NAME.put("HR1", "Asistant HR");
    	DESIGNATION_NAME.put("M01", "Assistant Manager");
    }

    @Override
    public Employee process(Employee employee) throws Exception {
        employee.setDesignation(DESIGNATION_NAME.get(employee.getDesignation())); //transform code to name
        employee.setUpdatedAt(new Date());
        return employee;
    }
}
