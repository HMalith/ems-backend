package net.malith.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.sql.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="salaries")

public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salaryId;

    @Column(name="salary_amount",nullable = false)
    private double amount;
    @Column(name="pay_date",nullable = false)
    private Date payDate;




}
