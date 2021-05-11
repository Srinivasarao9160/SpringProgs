package com.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
