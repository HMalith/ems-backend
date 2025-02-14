package net.malith.ems.controller;


import lombok.AllArgsConstructor;
import net.malith.ems.dto.SalaryDto;
import net.malith.ems.service.SalaryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/salaries")

@AllArgsConstructor

public class SalaryController {

    private SalaryService salaryService;

    @PostMapping
    public ResponseEntity<SalaryDto> createSalary(@RequestBody SalaryDto salaryDto){
        SalaryDto savedSalaryDto=salaryService.createSalary(salaryDto);

        return new ResponseEntity<>(savedSalaryDto,HttpStatus.CREATED);

    }
}
