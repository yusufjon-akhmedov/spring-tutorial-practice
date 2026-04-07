package com.yusufjon.springboot.cruddemo.dao;

import com.yusufjon.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that is it ... no need to write any code!
}
