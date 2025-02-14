package net.malith.ems.repository;

import net.malith.ems.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary,Long> {
}
