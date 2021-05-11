package com.transaction.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.entity.PassengerDetails;

public interface PassengerDetailsDao extends JpaRepository<PassengerDetails, Integer> {

}
