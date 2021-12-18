package com.ratnesh.rtl.batch;

import com.ratnesh.rtl.model.Employee;
import com.ratnesh.rtl.repository.EmployeeRepository;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Employee> {

	@Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void write(List<? extends Employee> employees) throws Exception{
    	employeeRepository.saveAll(employees);
    }
}
