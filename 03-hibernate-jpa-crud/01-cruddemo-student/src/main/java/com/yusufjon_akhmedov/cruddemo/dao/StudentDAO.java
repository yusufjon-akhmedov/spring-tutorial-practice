package com.yusufjon_akhmedov.cruddemo.dao;

import com.yusufjon_akhmedov.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    void update(Student theStudent);

    void delete(Integer id);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    int deleteAll();

}
