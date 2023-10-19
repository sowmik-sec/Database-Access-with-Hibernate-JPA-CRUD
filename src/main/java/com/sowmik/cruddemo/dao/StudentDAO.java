package com.sowmik.cruddemo.dao;

import com.sowmik.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}
