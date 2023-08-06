package com.unejsi.employee_crud.dao;


import com.unejsi.employee_crud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> employeeTypedQuery = entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = employeeTypedQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int id) {
        //get employee
        Employee employee = entityManager.find(Employee.class, id);

        //return employee
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        //save/update an employee (if emp exist update info else add him)
        Employee employeeDb = entityManager.merge(employee);

        //return employee
        return employeeDb;
    }

    @Override
    public void deleteById(int id) {
        //get employee
        Employee employee = entityManager.find(Employee.class, id);

        //delete employee
        entityManager.remove(employee);
    }

}
