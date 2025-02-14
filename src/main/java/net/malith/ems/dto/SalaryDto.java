package net.malith.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class SalaryDto {

    private Long salaryId;
    private double amount;
    private Date payDate;

}
