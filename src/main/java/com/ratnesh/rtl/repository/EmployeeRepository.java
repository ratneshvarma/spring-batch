package com.ratnesh.rtl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratnesh.rtl.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
