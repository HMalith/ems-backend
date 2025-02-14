package net.malith.ems.mapper;

import net.malith.ems.dto.SalaryDto;
import net.malith.ems.entity.Salary;

public class SalaryMapper {

    public static Salary mapToSalary(SalaryDto salaryDto){

        return new Salary(
                salaryDto.getSalaryId(),
                salaryDto.getAmount(),
                salaryDto.getPayDate()
        );

    }

    public static SalaryDto mapToSalaryDto(Salary salary){

        return new SalaryDto(
                salary.getSalaryId(),
                salary.getAmount(),
                salary.getPayDate()
        );

    }
}
