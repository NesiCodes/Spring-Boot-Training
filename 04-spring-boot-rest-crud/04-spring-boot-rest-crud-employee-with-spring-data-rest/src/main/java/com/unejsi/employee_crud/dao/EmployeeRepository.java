package com.unejsi.employee_crud.dao;

import com.unejsi.employee_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //no need to write code, we get some basic crud methods for free by extending JpaRepository
}
