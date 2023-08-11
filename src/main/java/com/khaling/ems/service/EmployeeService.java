package com.khaling.ems.service;

import com.khaling.ems.dto.EmployeeDTO;
import com.khaling.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {
    //add
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
    //get/id
    EmployeeDTO getEmployeeById(Long id);
    //get all
    List<EmployeeDTO> getAllEmployee();
    //update
    EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO);
    //delete
    void deleteEmployee(Long id);

}
