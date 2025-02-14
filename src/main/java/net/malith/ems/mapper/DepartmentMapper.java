package net.malith.ems.mapper;

import net.malith.ems.dto.DepartmentDto;
import net.malith.ems.entity.Department;

public class DepartmentMapper {

    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getDepartmentId(),
                departmentDto.getDepartmentName()
        );
    }

    public static DepartmentDto mapToDepartmentDto(Department department){
        return new DepartmentDto(
                department.getDepartmentId(),
                department.getDepartmentName()
        );
    }
}
