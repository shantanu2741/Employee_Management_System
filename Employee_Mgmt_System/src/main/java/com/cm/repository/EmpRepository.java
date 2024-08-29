package com.cm.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.entities.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}