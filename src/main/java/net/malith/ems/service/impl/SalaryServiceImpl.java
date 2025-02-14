package net.malith.ems.service.impl;

import lombok.AllArgsConstructor;
import net.malith.ems.dto.SalaryDto;
import net.malith.ems.entity.Salary;
import net.malith.ems.mapper.SalaryMapper;
import net.malith.ems.repository.SalaryRepository;
import net.malith.ems.service.SalaryService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class SalaryServiceImpl implements SalaryService {

    private SalaryRepository salaryRepository;
    @Override
    public SalaryDto createSalary(SalaryDto salaryDto) {
        Salary salary= SalaryMapper.mapToSalary(salaryDto);
        Salary savedSalary=salaryRepository.save(salary);
        return SalaryMapper.mapToSalaryDto(savedSalary);
    }
}
