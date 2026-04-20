package com.yusufjon.cruddemo.dao;

import com.yusufjon.cruddemo.entity.Instructor;
import com.yusufjon.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
