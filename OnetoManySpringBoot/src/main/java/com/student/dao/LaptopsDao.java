package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.Laptops;
@Repository
public interface LaptopsDao extends JpaRepository<Laptops, Integer> {

}
