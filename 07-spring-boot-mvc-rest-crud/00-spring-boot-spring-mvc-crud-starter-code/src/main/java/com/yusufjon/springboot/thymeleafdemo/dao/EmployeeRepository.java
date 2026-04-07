package com.yusufjon.springboot.thymeleafdemo.dao;

import com.yusufjon.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that is it ... no need to write any code!

    public List<Employee> findAllByOrderByLastNameAsc();
}
