package com.unejsi.employee_crud.dao;

import com.unejsi.employee_crud.entity.Employee;


import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);

}
