package com.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.model.Laptop;

public interface LaptopDao extends JpaRepository<Laptop, Integer> {

}
