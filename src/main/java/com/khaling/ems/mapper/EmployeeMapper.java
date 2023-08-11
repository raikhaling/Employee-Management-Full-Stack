package com.khaling.ems.mapper;

import com.khaling.ems.dto.EmployeeDTO;
import com.khaling.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDTO mapToEmployeeDto (Employee employee){
       return new EmployeeDTO(
               employee.getId(),
               employee.getFirstName(),
               employee.getLastName(),
               employee.getEmail());
    }
    public static Employee mapToEmployee(EmployeeDTO employeeDTO){
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail());
    }
}
