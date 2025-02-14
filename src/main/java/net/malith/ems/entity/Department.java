package net.malith.ems.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity

@Table(name="departments")

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @Column(name="department_name",nullable = false)
    private String departmentName;

    public Department(Long departmentId,String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;

    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="department_id",referencedColumnName = "departmentId")

    private List<Employee> employeeList;


}

