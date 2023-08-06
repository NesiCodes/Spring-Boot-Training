package com.unejsi.employee_crud.rest;

import com.unejsi.employee_crud.entity.Employee;
import com.unejsi.employee_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee searchEmployee(@PathVariable int employeeId){

        Employee employee = employeeService.findById(employeeId);

        if(employee == null){
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        return employee;
    }

    //add mapping for POST /employees (add new employee)
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        //in case that the user also enters id in the json we set it to 0 to force the save of the new item instead of update
        employee.setId(0);

        //save or update the employee in the db
        Employee employeeDb = employeeService.save(employee);

        //return the employee from db(includes the new id)
        return employeeDb;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        //save or update the employee in the db
        Employee employeeDb = employeeService.save(employee);

        //return the employee from db(includes the new id)
        return employeeDb;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);

        if(employee == null){
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);
        return "Employee with id: " + employeeId + " deleted successfully";
    }
}
