package net.malith.ems.service.impl;

import lombok.AllArgsConstructor;
import net.malith.ems.dto.DepartmentDto;
import net.malith.ems.entity.Department;
import net.malith.ems.mapper.DepartmentMapper;
import net.malith.ems.repository.DepartmentRepository;
import net.malith.ems.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department= DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment=departmentRepository.save(department);

        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }
}
