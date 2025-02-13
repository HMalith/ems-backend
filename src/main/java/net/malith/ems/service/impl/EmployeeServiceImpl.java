package net.malith.ems.service.impl;

import lombok.AllArgsConstructor;
import net.malith.ems.dto.EmployeeDto;
import net.malith.ems.entity.Employee;
import net.malith.ems.mapper.EmployeeMapper;
import net.malith.ems.repository.EmployeeRepository;
import net.malith.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);

    }
}
