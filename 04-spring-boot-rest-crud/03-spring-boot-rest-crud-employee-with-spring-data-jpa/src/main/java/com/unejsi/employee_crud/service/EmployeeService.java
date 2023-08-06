package com.unejsi.employee_crud.service;

import com.unejsi.employee_crud.entity.Employee;
import com.unejsi.employee_crud.rest.EmployeeController;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
